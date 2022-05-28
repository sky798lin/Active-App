package com.sky.active.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sky.active.models.Exercise;
import com.sky.active.models.ExerciseTemplate;
import com.sky.active.models.TemplateSummaryModel;
import com.sky.active.models.WorkoutTemplate;

@Controller
@RequestMapping("/workouts")
public class TemplateController {
	
	@GetMapping
	public String workouts(Model model) {
		model.addAttribute("templatesDisplay", temporaryTemplates());
		return "templates";
	}
	
	/* create temporary template display*/
	public TemplateSummaryModel temporaryTemplates() {
		Exercise squatBB = new Exercise("Squat (Barbell)", "Back squat using barbell", "Barbell", "Legs");
		Exercise hipThrustBB = new Exercise("Hip Thrust (Barbell)", "Hip thrust description", "Barbell", "Legs");
		Exercise lungeBW = new Exercise("Lunge (BodyWeight)", "Lunge description", "Reps Only", "Legs");
		Exercise plank = new Exercise("Plank", "Standard plank", "Duration", "Core");
		Exercise stairMaster = new Exercise("StairMaster", "Moving stairs", "Cardio", "Cardio");
		ExerciseTemplate squatBBLower = new ExerciseTemplate(squatBB, null);
		ExerciseTemplate hipThrustBBLower = new ExerciseTemplate(hipThrustBB, "Specific Note");
		ExerciseTemplate lungeBWLower = new ExerciseTemplate(lungeBW, null);
		ExerciseTemplate plankLower = new ExerciseTemplate(plank, "");
		ExerciseTemplate stairMasterLower = new ExerciseTemplate(stairMaster, "123");
		ExerciseTemplate[] lowerExercises = {squatBBLower, hipThrustBBLower, lungeBWLower, plankLower, stairMasterLower};
		WorkoutTemplate lower = new WorkoutTemplate(lowerExercises, "Lower" , null);
		
		Exercise benchPressBB = new Exercise("Bench Press (Barbell)", "Bench press description", "Barbell", "Chest");
		Exercise inclinePressDB = new Exercise("Incline Press (Dumbbell)", "Description", "Dumbbell", "Chest");
		Exercise latPulldown = new Exercise("Lat Pulldown (Cable)", "Wide overhand grip lat pulldown", "Cable", "Back");
		Exercise facePull = new Exercise("Face Pull", "Description", "Cable", "Shoulders");
		ExerciseTemplate benchPressBBUpper = new ExerciseTemplate(benchPressBB, "Some note");
		ExerciseTemplate inclinePressDBUpper = new ExerciseTemplate(inclinePressDB, null);
		ExerciseTemplate latPulldownUpper = new ExerciseTemplate(latPulldown, null);
		ExerciseTemplate facePullUpper = new ExerciseTemplate(facePull, null);
		ExerciseTemplate[] upperExercises = {benchPressBBUpper, inclinePressDBUpper, latPulldownUpper, facePullUpper};
		WorkoutTemplate upper = new WorkoutTemplate(upperExercises, "Upper" , "This is a note");
		
		WorkoutTemplate workoutA = new WorkoutTemplate(lowerExercises, "Workout A" , null);
		WorkoutTemplate workoutB = new WorkoutTemplate(lowerExercises, "This template has an extremely long name" , "This is a note");
		WorkoutTemplate[] templates = {lower, upper, workoutA, workoutB, lower, upper, workoutA, workoutB, lower, upper, workoutA, workoutB, lower, upper, workoutA, workoutB};
		TemplateSummaryModel templatesDisplay = new TemplateSummaryModel(templates);
		return templatesDisplay;
	}
}
