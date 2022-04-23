package com.sky.active;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@GetMapping
	public String home() {
		return "Home Page";
	}
	
	@GetMapping("{tab}")
	public String tab(@PathVariable String tab) {
		if(Arrays.asList("tab1", "tab2", "tab3").contains(tab)) {
			return "_" + tab;
		}
		
		return "empty";
	}
	
}
