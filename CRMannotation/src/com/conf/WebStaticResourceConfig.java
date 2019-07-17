package com.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebStaticResourceConfig implements WebMvcConfigurer {
	
	/*
	 * ������������
	 * <mvc:resources location="/,/resources/,/classpath:/META-INF/" mapping="/abc/**"/��
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry
		//mapping����
		.addResourceHandler("/abc/**")
		//location����
		.addResourceLocations("/","/js/","/images/");
		
	}	
}
