package com.Love.darling.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.controllers")
public class LoveConfig {

	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;

	}
	/*
	 * 1 step is to make the class as a to configable to write a code 2 give the
	 * annotations
	 * 
	 * @EnableWebMvc
	 * 
	 * @Configuraton
	 * 
	 * @ComponentScan these are the class level annotations we can this bean class
	 * we don't want to write a beans.xml 3 create a BEANS methods to implement the
	 * method once we will the return type must be a InternalResourceViewResolver
	 * and create a object in method context after override the setter methods
	 * setPrefix setSuffix that's it complete the config of Beans by using java
	 * based annotations.
	 */

}
