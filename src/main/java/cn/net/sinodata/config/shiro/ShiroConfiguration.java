package cn.net.sinodata.config.shiro;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.authc.AnonymousFilter;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import org.apache.shiro.web.filter.authc.UserFilter;
import org.apache.shiro.web.filter.authz.RolesAuthorizationFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

import cn.net.sinodata.vo.CacheType;



@Component
public class ShiroConfiguration {
	//private static final Logger logger = LoggerFactory.getLogger(ShiroConfiguration.class);
	public static final String PREMISSION_STRING = "perms[\"{0}\"]";
	
	/**
	 * ShiroFilterFactoryBean 处理拦截资源文件问题。
	 * 注意：单独一个ShiroFilterFactoryBean配置是或报错的，以为在
	 * 初始化ShiroFilterFactoryBean的时候需要注入：SecurityManager
	 *
	 * Filter Chain定义说明 1、一个URL可以配置多个Filter，使用逗号分隔 2、当设置多个过滤器时，全部验证通过，才视为通过
	 * 3、部分过滤器可指定参数，如perms，roles
	 *
	 */
	@Bean(name = "shiroFilter")
	public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager) {
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();

	    shiroFilterFactoryBean.setSecurityManager(securityManager);

	    Map logoutFilter = new LinkedHashMap();
	    LogoutFilter outFilter = new LogoutFilter();
	    outFilter.setRedirectUrl("/auth/login");
	    logoutFilter.put("/auth/logout", outFilter);
	    shiroFilterFactoryBean.setFilters(logoutFilter);

	    shiroFilterFactoryBean.setLoginUrl("/auth/toUserIndex");

	    shiroFilterFactoryBean.setSuccessUrl("/auth/toUserIndex");

	    shiroFilterFactoryBean.setUnauthorizedUrl("/error/403");

	    Map filterChainDefinitionMap = new LinkedHashMap();

	    filterChainDefinitionMap.put("/static/**", "anon");

	    filterChainDefinitionMap.put("/error/**", "anon");

	    filterChainDefinitionMap.put("/public/**", "anon");

	    filterChainDefinitionMap.put("/**", "authc");
	    shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);

	    Map filters = new HashMap();
	    filters.put("anon", new AnonymousFilter());
	    filters.put("authc", new FormAuthenticationFilter());
	    filters.put("logout", new LogoutFilter());
	    filters.put("roles", new RolesAuthorizationFilter());
	    filters.put("user", new UserFilter());
	    shiroFilterFactoryBean.setFilters(filters);
	    return shiroFilterFactoryBean;
	}

	
	
	/**
	 * 核心管理器
	 * 
	 * @return
	 */
	@Bean(name = "securityManager")
	public DefaultWebSecurityManager securityManager(EhCacheManager shiroCacheManager, UserRealm myShiroRealm) {
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		securityManager.setRealm(myShiroRealm);
		securityManager.setCacheManager(shiroCacheManager);
		// 并绑定给SecurityUtils
		SecurityUtils.setSecurityManager(securityManager);

		return securityManager;
	}

	@Bean
	public AuthorizationAttributeSourceAdvisor getAuthorizationAttributeSourceAdvisor(SecurityManager securityManager) {
		AuthorizationAttributeSourceAdvisor aasa = new AuthorizationAttributeSourceAdvisor();
		aasa.setSecurityManager(securityManager);
		return new AuthorizationAttributeSourceAdvisor();
	}

	/**
	 * 身份认证realm
	 * 
	 * @return
	 */
	@Bean
	@DependsOn("lifecycleBeanPostProcessor")
	public UserRealm myShiroRealm(EhCacheManager shiroCacheManager) {
		/*
		 * userRealm.cachingEnabled：启用缓存，默认 false；
		 * userRealm.authenticationCachingEnabled：启用身份验证缓存，即缓存
		 * AuthenticationInfo 信息，默认 false； userRealm.authenticationCacheName：缓存
		 * AuthenticationInfo 信息的缓存名称； userRealm.
		 * authorizationCachingEnabled：启用授权缓存，即缓存 AuthorizationInfo 信息，默认 false；
		 * userRealm. authorizationCacheName：缓存 AuthorizationInfo 信息的缓存名称；
		 * cacheManager：缓存管理器，此处使用 EhCacheManager，即 Ehcache 实现，需要导入相应的 Ehcache
		 * 依赖，请参考 pom.xml；
		 */
		UserRealm userRealm = new UserRealm();
		userRealm.setAuthenticationCacheName(CacheType.MENU.getCode());
		userRealm.setAuthorizationCacheName(CacheType.MENU.getCode());
		userRealm.setCacheManager(shiroCacheManager);
		return userRealm;
	}
	
	/**
	 * 缓存
	 */
	
	@Bean(name = "shiroCacheManager")
	public EhCacheManager shiroEhCacheManager(EhCacheCacheManager manager) {
		EhCacheManager ehCacheManager = new EhCacheManager();
		ehCacheManager.setCacheManager(manager.getCacheManager());
		return ehCacheManager;
	}
	
	/**
	 * 生命周期管理
	 * 
	 * @return
	 */
	@Bean
	public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
		return new LifecycleBeanPostProcessor();
	}

	
	@Bean
	@DependsOn("lifecycleBeanPostProcessor")
	public DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {
		DefaultAdvisorAutoProxyCreator daap = new DefaultAdvisorAutoProxyCreator();
		daap.setProxyTargetClass(true);
		return daap;
	}
	
}
