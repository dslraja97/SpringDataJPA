package com.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	@ResponseBody
	public String displayWelcome() {
		return "Welcome to m y Website !!";
	}

	@GetMapping("/message")
	public String displayMessage(Model model) {

		model.addAttribute("message", "Hi , How Are You?");
		return "index";
	}

}
