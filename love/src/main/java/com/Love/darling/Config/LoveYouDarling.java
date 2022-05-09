package com.Love.darling.Config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LoveYouDarling extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	     Class arr[]= {LoveYouDarling.class};
		return arr;
	}

	
	/**
	 * this is the to write a servletMapping config
	 * so we can override that methods
	 */
	@Override
	protected String[] getServletMappings() {
		String [] arr = {"/love.com/*"};
		return arr;
	}

}
