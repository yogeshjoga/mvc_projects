package com.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeStudent {
	@RequestMapping("/student")
	public String home() {
		return "welcome";
	}

}
