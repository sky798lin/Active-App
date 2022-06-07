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
		Exercise squatBB = new Exercise("Squat (Barbell)", "Barbell", "Legs");
		Exercise hipThrustBB = new Exercise("Hip Thrust (Barbell)", "Barbell", "Legs");
		Exercise lungeBW = new Exercise("Lunge (BodyWeight)", "Reps Only", "Legs");
		Exercise plank = new Exercise("Plank", "Duration", "Core");
		Exercise stairMaster = new Exercise("StairMaster", "Cardio", "Cardio");
		ExerciseTemplate squatBBLower = new ExerciseTemplate(squatBB, null);
		ExerciseTemplate hipThrustBBLower = new ExerciseTemplate(hipThrustBB, "Specific Note");
		ExerciseTemplate lungeBWLower = new ExerciseTemplate(lungeBW, null);
		ExerciseTemplate plankLower = new ExerciseTemplate(plank, "");
		ExerciseTemplate stairMasterLower = new ExerciseTemplate(stairMaster, "123");
		ExerciseTemplate[] lowerExercises = {squatBBLower, hipThrustBBLower, lungeBWLower, plankLower, stairMasterLower};
		WorkoutTemplate lower = new WorkoutTemplate(lowerExercises, "Lower" , null);
		
		Exercise benchPressBB = new Exercise("Bench Press (Barbell)", "Barbell", "Chest");
		Exercise inclinePressDB = new Exercise("Incline Press (Dumbbell)", "Dumbbell", "Chest");
		Exercise latPulldown = new Exercise("Lat Pulldown (Cable)", "Cable", "Back");
		Exercise facePull = new Exercise("Face Pull", "Cable", "Shoulders");
		ExerciseTemplate benchPressBBUpper = new ExerciseTemplate(benchPressBB, "Some note");
		ExerciseTemplate inclinePressDBUpper = new ExerciseTemplate(inclinePressDB, null);
		ExerciseTemplate latPulldownUpper = new ExerciseTemplate(latPulldown, null);
		ExerciseTemplate facePullUpper = new ExerciseTemplate(facePull, null);
		ExerciseTemplate[] upperExercises = {benchPressBBUpper, inclinePressDBUpper, latPulldownUpper, facePullUpper};
		WorkoutTemplate upper = new WorkoutTemplate(upperExercises, "Upper" , "This is a note");
		
		WorkoutTemplate workoutA = new WorkoutTemplate(lowerExercises, "This string is 30 characters!!" , null);
		WorkoutTemplate workoutB = new WorkoutTemplate(lowerExercises, "This template has a ridiculously long name(limit to 30 char)", "This is a note");
		WorkoutTemplate[] templates = {lower, upper, workoutA, workoutB};
		TemplateSummaryModel templatesDisplay = new TemplateSummaryModel(templates);
		return templatesDisplay;
	}
}
