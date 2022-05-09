package com.libControllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeToLib {
	@RequestMapping("/welcome")
	public String welcome() {
		return "welcome";
	}

}
