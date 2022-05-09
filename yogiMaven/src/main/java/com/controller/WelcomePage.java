package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomePage {
	@RequestMapping("/welcome")
	public String welcome() {
		System.out.println("this is the welcome page!!");
		return "welcome";
		
	}
	


}
