package com.sky.active.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/create-template")
public class createTemplateController {
	@GetMapping
	public String createTemplate() {
		return "createTemplate";
	}
}
