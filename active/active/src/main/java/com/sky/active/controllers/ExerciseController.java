package com.sky.active.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sky.active.models.Exercise;
import com.sky.active.repositories.ExerciseRepository;

@RestController
@RequestMapping("/exercises")
public class ExerciseController {
	@Autowired
	private ExerciseRepository exerciseRepository;
	
	@PostMapping("/add")
	public String addExercise(@RequestParam String name, @RequestParam String equipment, @RequestParam String muscleGroup) {
		Exercise exercise = new Exercise(name, equipment, muscleGroup);
		exerciseRepository.save(exercise);
		return "saved";
	}
	
	@GetMapping("/all")
	public Iterable<Exercise> getAllExercises(){
		return exerciseRepository.findAll();
	}
}
