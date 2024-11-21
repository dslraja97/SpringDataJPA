package com.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {

	@GetMapping("/welcome")
	@ResponseBody
	public String displayWelcome() {
		return "Welcome to Page!!";
	}

	@GetMapping("/greeting")
	@ResponseBody
	public String greet() {
		return "Hi This great Karikalan Magic Show Website!!";
	}
}
