package com.sky.active.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sky.active.models.Exercise;
import com.sky.active.models.ExerciseTemplate;
import com.sky.active.models.Set;
import com.sky.active.models.TemplateSummaryModel;
import com.sky.active.models.WorkoutTemplate;

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
		Set set = new Set();
		Set[] sets3 = {set, set, set};
		Set[] sets1 = {set};
		ExerciseTemplate squatBBLower = new ExerciseTemplate(squatBB, sets3, null);
		ExerciseTemplate hipThrustBBLower = new ExerciseTemplate(hipThrustBB, sets3, "Specific Note");
		ExerciseTemplate lungeBWLower = new ExerciseTemplate(lungeBW, sets3, null);
		ExerciseTemplate plankLower = new ExerciseTemplate(plank, sets1, "");
		ExerciseTemplate stairMasterLower = new ExerciseTemplate(stairMaster, sets1, "123");
		ExerciseTemplate[] lowerExercises = {squatBBLower, hipThrustBBLower, lungeBWLower, plankLower, stairMasterLower};
		WorkoutTemplate lower = new WorkoutTemplate(lowerExercises, "Lower" , null);
		
		Exercise benchPressBB = new Exercise("Bench Press (Barbell)", "Bench press description", "Barbell", "Chest");
		Exercise inclinePressDB = new Exercise("Incline Press (Dumbbell)", "Description", "Dumbbell", "Chest");
		Exercise latPulldown = new Exercise("Lat Pulldown (Cable)", "Wide overhand grip lat pulldown", "Cable", "Back");
		Exercise facePull = new Exercise("Face Pull", "Description", "Cable", "Shoulders");
		ExerciseTemplate benchPressBBUpper = new ExerciseTemplate(benchPressBB, sets3, "Some note");
		ExerciseTemplate inclinePressDBUpper = new ExerciseTemplate(inclinePressDB, sets1, null);
		ExerciseTemplate latPulldownUpper = new ExerciseTemplate(latPulldown, sets3, null);
		ExerciseTemplate facePullUpper = new ExerciseTemplate(facePull, sets3, null);
		ExerciseTemplate[] upperExercises = {benchPressBBUpper, inclinePressDBUpper, latPulldownUpper, facePullUpper};
		WorkoutTemplate upper = new WorkoutTemplate(upperExercises, "Upper" , "This is a note");
		
		WorkoutTemplate[] templates = {lower, upper};
		TemplateSummaryModel templatesDisplay = new TemplateSummaryModel(templates);
		String example = "This is an example";
	}
}
