package com.sky.active.models;

public class ExerciseTemplate {
	
	private Exercise exercise;
	private Set[] sets;
	private String notes;
	
	public ExerciseTemplate(Exercise exercise, Set[] sets, String notes) {
		this.exercise = exercise;
		this.sets = sets;
		this.notes = notes;
	}

	
	public Exercise getExercise() {
		return exercise;
	}

	public void setExercise(Exercise exercise) {
		this.exercise = exercise;
	}

	public Set[] getSets() {
		return sets;
	}

	public void setSets(Set[] sets) {
		this.sets = sets;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}
}
