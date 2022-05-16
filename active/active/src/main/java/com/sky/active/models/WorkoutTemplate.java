package com.sky.active.models;

public class WorkoutTemplate {
	
	public ExerciseTemplate[] exercises;
	public String name;
	public String notes;
	
	public WorkoutTemplate(ExerciseTemplate[] exercises, String name, String notes) {
		this.exercises = exercises;
		this.name = name;
		this.notes = notes;
	}
}
