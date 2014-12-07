package com.tony.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@Import({MysqlConfig.class})
@ComponentScan(basePackages="com.tony",excludeFilters=@ComponentScan.Filter(
			value={Configuration.class,Controller.class,RestController.class},
			type=FilterType.ANNOTATION
		))
public class AppConfig {
	
}
