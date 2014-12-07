package com.tony.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.tony.controller")
public class WebConfig extends WebMvcConfigurerAdapter {
	
	public static final String VIEW="/views/";
	public static final String LOGIN_URL="/login";
	public static final String LOGIN_VIEW="login.html";
	
	//很关键的配置
	@Override
	public void configureDefaultServletHandling(
			DefaultServletHandlerConfigurer configurer) {
		// TODO Auto-generated method stub
		configurer.enable();
	}
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// TODO Auto-generated method stub
		registry.addViewController(LOGIN_URL).setViewName(LOGIN_VIEW);
		registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
	}
	
	
	
	@Bean
	public ViewResolver viewResolver(){
//		UrlBasedViewResolver resolver=new UrlBasedViewResolver();
//		resolver.setViewClass(JstlView.class);
//		resolver.setPrefix(VIEW);
//		resolver.setSuffix(".jsp");
		InternalResourceViewResolver resolver=new InternalResourceViewResolver();
		resolver.setPrefix(VIEW);
		resolver.setSuffix(".jsp");
		resolver.setCache(false);
		return resolver;
	}
}
