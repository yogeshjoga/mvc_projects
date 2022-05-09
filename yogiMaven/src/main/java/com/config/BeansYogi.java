package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.controller.WelcomePage;

public class BeansYogi extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class [] arr = {WelcomePage.class} ;
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String []arr = {"/home/*"};
		return arr;
	}

}
