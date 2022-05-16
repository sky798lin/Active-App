package com.sky.active.models;

public class ExerciseTemplate {
	
	public Exercise exercise;
	public Set[] sets;
	public String notes;
	
	public ExerciseTemplate(Exercise exercise, Set[] sets, String notes) {
		this.exercise = exercise;
		this.sets = sets;
		this.notes = notes;
	}
}
