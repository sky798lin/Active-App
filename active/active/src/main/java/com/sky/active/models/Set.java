package com.sky.active.models;

import java.time.Duration;

public class Set {
	
	private double weight;
	private int reps;
	private Duration time;
	private double distance;
	
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
	

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getReps() {
		return reps;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}

	public Duration getTime() {
		return time;
	}

	public void setTime(Duration time) {
		this.time = time;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}
}
