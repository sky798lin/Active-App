package com.sky.active.models;

import java.time.Duration;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class WorkoutHistory {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	@ManyToOne
	private WorkoutTemplate template;
	private Date workoutDate;
	private Duration workoutTime;
	
	public WorkoutHistory() {
		
	}
	
	public WorkoutHistory(WorkoutTemplate template, Date workoutDate, Duration workoutTime) {
		this.template = template;
		this.workoutDate = workoutDate;
		this.setWorkoutTime(workoutTime);
	}
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public WorkoutTemplate getTemplate() {
		return template;
	}

	public void setTemplate(WorkoutTemplate template) {
		this.template = template;
	}

	public Date getWorkoutDate() {
		return workoutDate;
	}

	public void setWorkoutDate(Date workoutDate) {
		this.workoutDate = workoutDate;
	}

	public Duration getWorkoutTime() {
		return workoutTime;
	}

	public void setWorkoutTime(Duration workoutTime) {
		this.workoutTime = workoutTime;
	}
}
