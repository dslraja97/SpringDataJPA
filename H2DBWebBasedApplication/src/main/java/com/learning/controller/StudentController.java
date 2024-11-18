package com.learning.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.learning.binding.Student;
import com.learning.entity.StudentEntity;
import com.learning.repository.StudentRepository;

@Controller
public class StudentController {

	@Autowired
	private StudentRepository repository;

	@GetMapping("/form")
	public String loadForm(Model model) {

		extracted(model);
		return "index";
	}

	@PostMapping("/save")
	public String save(Student s, Model model) {
		System.out.println(s);
		StudentEntity entity = new StudentEntity();
		entity.setTimings(Arrays.toString(s.getTimings()));
		BeanUtils.copyProperties(s, entity);
		repository.save(entity);
		model.addAttribute("message", "Record Saved Succesfully!");
		extracted(model);

		return "index";
	}

	private void extracted(Model model) {
		List<String> courseList = new ArrayList<>();
		courseList.add("Java");
		courseList.add("Python");
		courseList.add("Springboot");
		List<String> timingsList = new ArrayList<>();
		timingsList.add("morning");
		timingsList.add("afternoon");
		timingsList.add("evening");
		model.addAttribute("timings", timingsList);
		model.addAttribute("courses", courseList);
		Student student = new Student();
		model.addAttribute("student", student);
	}
}
