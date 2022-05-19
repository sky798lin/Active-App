package com.sky.active.models;

public class ExerciseHistory {
	
	private ExerciseTemplate exercise;
	
	public ExerciseHistory(ExerciseTemplate exercise) {
		this.exercise = exercise;
	}

	
	public ExerciseTemplate getExercise() {
		return exercise;
	}

	public void setExercise(ExerciseTemplate exercise) {
		this.exercise = exercise;
	}
}
