package com.sky.active.models;

import java.time.Duration;

public class WorkoutTemplate {
	
	private ExerciseTemplate[] exercises;
	private String name;
	private String notes;
	private Duration workoutTime;
	
	public WorkoutTemplate(ExerciseTemplate[] exercises, String name, String notes) {
		this.exercises = exercises;
		this.name = name;
		this.notes = notes;
		this.setWorkoutTime(Duration.ZERO);
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

	public Duration getWorkoutTime() {
		return workoutTime;
	}

	public void setWorkoutTime(Duration workoutTime) {
		this.workoutTime = workoutTime;
	}
}
