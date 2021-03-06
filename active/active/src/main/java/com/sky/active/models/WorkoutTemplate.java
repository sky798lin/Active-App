package com.sky.active.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WorkoutTemplate {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private ExerciseTemplate[] exercises;
	@Column(length = 30)
	private String name;
	private String notes;
	
	public WorkoutTemplate() {
		
	}
	
	public WorkoutTemplate(ExerciseTemplate[] exercises, String name, String notes) {
		this.exercises = exercises;
		this.name = name;
		this.notes = notes;
	}

	
	public Integer getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
