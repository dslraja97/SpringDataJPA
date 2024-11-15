package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.learning.bean.User;
import com.learning.repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	ConfigurableApplicationContext applicationContext;

	@GetMapping("/")
	public String displayForm() {
		return "index";
	}

	@PostMapping("/userDetailes")
	public String getDetailes(User user, Model model) {
		System.out.println(user);
		UserRepository userRepository = applicationContext.getBean(UserRepository.class);
		userRepository.save(user);
		model.addAttribute("message", "Record Saved Succesfully");
		return "index";
	}
}
