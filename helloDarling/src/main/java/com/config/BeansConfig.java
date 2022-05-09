package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.controller.Lovely;

public class BeansConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class [] arr = {Lovely.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String [] arr = {"/home/*"};
		return arr;
	}

}
