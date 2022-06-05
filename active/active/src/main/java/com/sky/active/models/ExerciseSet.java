package com.sky.active.models;

import java.time.Duration;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExerciseSet {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private Double weight;
	private Integer reps;
	private Duration time;
	private Double distance;
	
	public ExerciseSet() {
		
	}
	
	/* Constructor for most exercise sets: lifting weight, adding weight on top
	 * of body weight, or removing weight from body weight for assisted exercises*/
	public ExerciseSet(Double weight, Integer reps) {
		this.weight = weight;
		this.reps = reps;
	}
	
	/* Constructor for purely body weight exercise sets*/
	public ExerciseSet(Integer reps) {
		this.reps = reps;
	}
	
	/* Constructor for purely body weight exercise sets requiring holding position*/
	public ExerciseSet(Duration time) {
		this.time = time;
	}
	
	/* Constructor for cardio exercise sets*/
	public ExerciseSet(Double distance, Duration time) {
		this.distance = distance;
		this.time = time;
	}
	

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Integer getReps() {
		return reps;
	}

	public void setReps(Integer reps) {
		this.reps = reps;
	}

	public Duration getTime() {
		return time;
	}

	public void setTime(Duration time) {
		this.time = time;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}
}
