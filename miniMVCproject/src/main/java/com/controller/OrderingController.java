package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderingController {
	// this is for welcome page to invoke
	@RequestMapping("/welcome")
	public String ordering() {
		return "wel";
	}

}