package cn.net.sinodata.config;

import java.util.Properties;

import javax.sql.DataSource;

import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import com.github.pagehelper.PageHelper;

/**
 * MyBatis基础配置
 *
 * @author Pangpj
 * @since 2017年9月7日15:48:33
 */
@Configuration
@EnableTransactionManagement
public class MyBatisConfig implements TransactionManagementConfigurer {
	@Autowired
	DataSource dataSource;

	@Bean(name = "sqlSessionFactory")
	public SqlSessionFactory sqlSessionFactoryBean() {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		bean.setDataSource(dataSource);
		bean.setTypeAliasesPackage("tk.mybatis.springboot.model");

		// 分页插件
		//PageHelper pageHelper = new PageHelper();
		Properties properties = new Properties();
		//properties.setProperty("helperDialect", "mysql");
		properties.setProperty("reasonable", "true");
		properties.setProperty("supportMethodsArguments", "true");
		properties.setProperty("pageSizeZero", "true");
		//pageHelper.setProperties(properties);

		PageInterceptor interceptor = new PageInterceptor();
		interceptor.setProperties(properties);

		// 添加插件
		bean.setPlugins(new Interceptor[] { interceptor });

		// 添加XML目录
//		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		try {
//			bean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
			return bean.getObject();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}

	@Bean
	@Override
	public PlatformTransactionManager annotationDrivenTransactionManager() {
		return new DataSourceTransactionManager(dataSource);
	}
}
