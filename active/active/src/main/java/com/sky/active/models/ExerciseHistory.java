package com.sky.active.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ExerciseHistory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	private ExerciseTemplate exercise;
	private ExerciseSet[] sets;
	
	public ExerciseHistory() {
		
	}
	
	public ExerciseHistory(ExerciseTemplate exercise, ExerciseSet[] sets) {
		this.exercise = exercise;
		this.setSets(sets);
	}
	

	public Integer getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public ExerciseTemplate getExercise() {
		return exercise;
	}

	public void setExercise(ExerciseTemplate exercise) {
		this.exercise = exercise;
	}

	public ExerciseSet[] getSets() {
		return sets;
	}

	public void setSets(ExerciseSet[] sets) {
		this.sets = sets;
	}
}
