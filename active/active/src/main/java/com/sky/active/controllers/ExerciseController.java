package com.sky.active.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sky.active.models.Exercise;
import com.sky.active.repositories.ExerciseRepository;

@Controller
@RequestMapping("/exercises")
public class ExerciseController {
	@Autowired
	private ExerciseRepository exerciseRepository;
	
	@PostMapping("/add")
	public @ResponseBody String addExercise(@RequestParam String name, @RequestParam String description, 
			@RequestParam String equipment, @RequestParam String muscleGroup) {
		Exercise exercise = new Exercise(name, description, equipment, muscleGroup);
		return "saved";
	}
}
