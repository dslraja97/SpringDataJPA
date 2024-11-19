package com.learning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	@GetMapping("/welcome")
	public String welcomeMessage(Model model) {

		model.addAttribute("message", "Welcome to my New ThymeLeaf Based WebPage!!");
		return "index";
	}

}
