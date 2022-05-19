package com.sky.active.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sky.active.models.Exercise;

@Controller
@RequestMapping("/workouts")
public class templateController {
	@GetMapping
	public String workouts() {
		return "templates";
	}
	
	/* create temporary template display*/
	public void temporaryTemplates() {
		Exercise squatBB = new Exercise("Squat (Barbell)", "Back squat using barbell", "Barbell", "Legs");
		Exercise hipThrustBB = new Exercise("Hip Thrust (Barbell)", "Hip thrust description", "Barbell", "Legs");
		Exercise lungeBW = new Exercise("Lunge (BodyWeight)", "Lunge description", "Reps Only", "Legs");
		Exercise plank = new Exercise("Plank", "Standard plank", "Duration", "Core");
		Exercise stairMaster = new Exercise("StairMaster", "Moving stairs", "Cardio", "Cardio");
		String example = "This is an example";
	}
}
