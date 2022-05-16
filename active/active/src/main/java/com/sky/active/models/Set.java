package com.sky.active.models;

import java.time.Duration;

public class Set {
	
	public double weight;
	public int reps;
	public Duration time;
	public double distance;
	
	/* Constructor for most exercise sets: lifting weight, adding weight on top
	 * of body weight, or removing weight from body weight for assisted exercises*/
	public Set(double weight, int reps) {
		this.weight = weight;
		this.reps = reps;
	}
	
	/* Constructor for purely body weight exercise sets*/
	public Set(int reps) {
		this.reps = reps;
	}
	
	/* Constructor for purely body weight exercise sets requiring holding position*/
	public Set(Duration time) {
		this.time = time;
	}
	
	/* Constructor for cardio exercise sets*/
	public Set(double distance, Duration time) {
		this.distance = distance;
		this.time = time;
	}
}
