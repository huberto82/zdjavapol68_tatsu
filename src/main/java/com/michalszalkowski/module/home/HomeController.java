package com.michalszalkowski.module.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/hello")
	@ResponseBody
	public String greeting() {
		return "Hello World";
	}

	@RequestMapping("/by")
	@ResponseBody
	public String noGreeting() {
		return "Go away";
	}

}
