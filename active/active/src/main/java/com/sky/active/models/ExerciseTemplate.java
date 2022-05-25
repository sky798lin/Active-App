package com.sky.active.models;

public class ExerciseTemplate {
	
	private Exercise exercise;
	private String notes;
	
	public ExerciseTemplate(Exercise exercise, String notes) {
		this.exercise = exercise;
		this.notes = notes;
	}

	
	public Exercise getExercise() {
		return exercise;
	}

	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
