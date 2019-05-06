package cn.net.sinodata.config;

import java.util.Properties;

import javax.sql.DataSource;

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
		PageHelper pageHelper = new PageHelper();
		Properties properties = new Properties();
		properties.setProperty("reasonable", "true");
		
//		  <!-- 4.0.0以后版本可以不设置该参数 -->
//        <property name="dialect" value="mysql"/>
//		properties.setProperty("dialect", "oracle");
		properties.setProperty("dialect", "mysql");
//        <!-- 该参数默认为false -->
//        <!-- 设置为true时，会将RowBounds第一个参数offset当成pageNum页码使用 -->
//        <!-- 和startPage中的pageNum效果一样-->
//        <property name="offsetAsPageNum" value="true"/>
		properties.setProperty("offsetAsPageNum", "true");
//        <!-- 该参数默认为false -->
//        <!-- 设置为true时，使用RowBounds分页会进行count查询 -->
//        <property name="rowBoundsWithCount" value="true"/>
		properties.setProperty("rowBoundsWithCount", "true");
//        <!-- 设置为true时，如果pageSize=0或者RowBounds.limit = 0就会查询出全部的结果 -->
//        <!-- （相当于没有执行分页查询，但是返回结果仍然是Page类型）-->
//        <property name="pageSizeZero" value="true"/>
		properties.setProperty("pageSizeZero", "true");
//        <!-- 3.3.0版本可用 - 分页参数合理化，默认false禁用 -->
//        <!-- 启用合理化时，如果pageNum<1会查询第一页，如果pageNum>pages会查询最后一页 -->
//        <!-- 禁用合理化时，如果pageNum<1或pageNum>pages会返回空数据 -->
//        <property name="reasonable" value="false"/>
		properties.setProperty("reasonable", "false");
//        <!-- 3.5.0版本可用 - 为了支持startPage(Object params)方法 -->
//        <!-- 增加了一个`params`参数来配置参数映射，用于从Map或ServletRequest中取值 -->
//        <!-- 可以配置pageNum,pageSize,count,pageSizeZero,reasonable,orderBy,不配置映射的用默认值 -->
//        <!-- 不理解该含义的前提下，不要随便复制该配置 -->
//        <property name="params" value="pageNum=pageHelperStart;pageSize=pageHelperRows;"/>
//		properties.setProperty("params", "pageNum=pageHelperStart;pageSize=pageHelperRows;");
//        <!-- 支持通过Mapper接口参数来传递分页参数 -->
//        <property name="supportMethodsArguments" value="false"/>
		properties.setProperty("supportMethodsArguments", "false");
//        <!-- always总是返回PageInfo类型,check检查返回类型是否为PageInfo,none返回Page -->
//        <property name="returnPageInfo" value="none"/>
		properties.setProperty("returnPageInfo", "none");
		
		
		
		pageHelper.setProperties(properties);

		// 添加插件
		bean.setPlugins(new Interceptor[] { pageHelper });

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
