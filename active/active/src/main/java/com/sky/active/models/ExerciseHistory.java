package com.sky.active.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExerciseHistory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@Column(nullable = false)
	private ExerciseTemplate exercise;
	@Column(nullable = false)
	private Set[] sets;
	
	public ExerciseHistory() {
		
	}
	
	public ExerciseHistory(ExerciseTemplate exercise, Set[] sets) {
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

	public Set[] getSets() {
		return sets;
	}

	public void setSets(Set[] sets) {
		this.sets = sets;
	}
}
