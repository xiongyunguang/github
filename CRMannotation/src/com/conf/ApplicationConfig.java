package com.conf;

import java.io.IOException;

import javax.sql.DataSource;

import javax.sql.DataSource;
import org.apache.ibatis.logging.log4j2.Log4j2Impl;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import com.mchange.v2.c3p0.ComboPooledDataSource;

@org.springframework.context.annotation.Configuration
@EnableWebMvc
@ComponentScan("com")
public class ApplicationConfig {
	//����c3p0��ʽ����
	@Bean
	public ComboPooledDataSource comboPooledDataSource() {
		return new ComboPooledDataSource();
	}
	
	//����mybatis��������
	
	//����SqlSessionFactory����
	@Bean
	@Autowired
	public SqlSessionFactory sqlSessionFactory(DataSource comboPooledDataSource,Configuration configuration) {
		
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		
		//����Դע��
		sqlSessionFactoryBean.setDataSource(comboPooledDataSource);
		
		//ע��mybatis���������ļ�
		sqlSessionFactoryBean.setConfiguration(configuration);
		
		SqlSessionFactory sqlSessionFactory = null;
		//����mybatis������ʵ����ӳ���ļ�
		try {
			
			sqlSessionFactoryBean.setMapperLocations(new Resource[] { 
					new ClassPathResource("com/vo/UserVO-Mapper.xml"),
					new ClassPathResource("com/vo/JobVO-Mapper.xml"),
					new ClassPathResource("com/vo/ContractVO-Mapper.xml"),
					new ClassPathResource("com/vo/ClientVO-Mapper.xml"),
					new ClassPathResource("com/vo/AddressVO-Mapper.xml") });
			 
			
			sqlSessionFactory = sqlSessionFactoryBean.getObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return sqlSessionFactory;
	}
	
	//����mybatis���������ļ�
	@Bean
	public Configuration configuration() {
		Configuration configuration = new Configuration();
		configuration.setAggressiveLazyLoading(true);
		configuration.setCacheEnabled(true);
		configuration.setDefaultFetchSize(2000);
		configuration.setLazyLoadingEnabled(false);
		configuration.setLogImpl(Log4j2Impl.class);
		configuration.setMapUnderscoreToCamelCase(true);
		return configuration;
	}	
	
	//����SqlSessionTemplateģ��
	@Bean
	@Autowired
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		SqlSessionTemplate sqlSessionTemplate = null;
		try {
			sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
		}catch(Exception e){
			e.getStackTrace();
		}
		return sqlSessionTemplate;
	}	
	
}
