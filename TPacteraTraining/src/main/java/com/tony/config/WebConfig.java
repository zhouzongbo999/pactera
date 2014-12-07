package com.tony.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.tony.controller")
public class WebConfig extends WebMvcConfigurerAdapter {
	public static final String VIEW="/WEB-INF/views/";
	@Bean
	public ViewResolver viewResolver(){
		UrlBasedViewResolver resolver=new UrlBasedViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix(VIEW);
		resolver.setSuffix(".jsp");
//		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
//		resolver.setOrder(1);
//		resolver.setPrefix(VIEW);
//		resolver.setSuffix(".html");
//		resolver.setCache(false);
		return resolver;
	}
}
