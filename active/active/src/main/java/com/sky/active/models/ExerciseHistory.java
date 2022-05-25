package com.sky.active.models;

public class ExerciseHistory {
	
	private ExerciseTemplate exercise;
	private Set[] sets;
	
	public ExerciseHistory(ExerciseTemplate exercise, Set[] sets) {
		this.exercise = exercise;
		this.setSets(sets);
	}

	
	public ExerciseTemplate getExercise() {
		return exercise;
	}

	public void setExercise(ExerciseTemplate exercise) {
		this.exercise = exercise;
	}

	public Set[] getSets() {
		return sets;
	}

	public void setSets(Set[] sets) {
		this.sets = sets;
	}
}
