package com.sky.active.models;

public class WorkoutTemplate {
	
	private ExerciseTemplate[] exercises;
	private String name;
	private String notes;
	
	public WorkoutTemplate(ExerciseTemplate[] exercises, String name, String notes) {
		this.exercises = exercises;
		this.name = name;
		this.notes = notes;
	}

	
	public ExerciseTemplate[] getExercises() {
		return exercises;
	}

	public void setExercises(ExerciseTemplate[] exercises) {
		this.exercises = exercises;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
