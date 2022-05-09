package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyHeart {
	@RequestMapping("/myheart/*")
	public String myHeart() {
		System.out.println("it's completely deployed");
		return "love";
	}

}
