package cn.net.sinodata.config.shiro;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import cn.net.sinodata.model.TFunc;
import cn.net.sinodata.model.TRoles;
import cn.net.sinodata.model.TUsers;
import cn.net.sinodata.service.TFuncService;
import cn.net.sinodata.service.TRolesService;
import cn.net.sinodata.service.TUsersService;
import cn.net.sinodata.util.StringUtil;

public class UserRealm extends AuthorizingRealm {

	private static final Logger logger = LoggerFactory.getLogger(UserRealm.class);

	@Autowired
	private TUsersService tUsersService;
	@Autowired
	private TRolesService tRolesService;
	@Autowired
	private TFuncService tFuncService;

	/**
	 * 设置密码凭证验证方式
	 */
	@PostConstruct
	public void initCredentialsMatcher(){
		setCredentialsMatcher(new CustomCredentialsMatcher());
	}
	
	/**
	 * 获取当前用户权限信息
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		logger.info("执行Shiro权限认证");
		TUsers user = (TUsers) super.getAvailablePrincipal(principals);
		if (user != null) {
			// 加载用户角色
			List<TRoles> roles = tRolesService.getRolesByUserId(user.getUserid());
			Set<String> rolesName = new HashSet<String>();
			for (TRoles role : roles) {
				rolesName.add(role.getName());
			}
			// 加载用户权限
			List<TFunc> ress = tFuncService.getResourcesByUserId(user.getUserid());
			Set<String> resNames = new HashSet<String>();
			for (TFunc res : ress) {
				if (StringUtil.isEmpty(res.getPermission())) {
					continue;
				}
				resNames.add(res.getPermission());
			}

			// 权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
			SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
			info.setRoles(rolesName);
			info.setStringPermissions(resNames);

			logger.info("加载用户角色：{}， 加载用户权限：{}", rolesName, resNames);

			return info;
		}
		// 返回null的话，就会导致任何用户访问被拦截的请求时，都会自动跳转到unauthorizedUrl指定的地址
		return null;

	}

	/**
	 * 身份验证
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) token;

		String username = usernamePasswordToken.getUsername();

		if (username == null) {
			throw new AccountException("用户名不能为空");
		}
		
		TUsers user = tUsersService.getUserById(username);

		if (user == null) {
			throw new UnknownAccountException("用户不存在");
		}
		if (!"0".equals(user.getStatus())) {
			throw new LockedAccountException("用户已锁定");
		}
		
		
		
		return new SimpleAuthenticationInfo(user, user.getPassword(), getName());
	}

}
