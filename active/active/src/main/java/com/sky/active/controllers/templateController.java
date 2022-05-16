package com.sky.active.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/workouts")
public class templateController {
	@GetMapping
	public String workouts() {
		return "templates";
	}
}
