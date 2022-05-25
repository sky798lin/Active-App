package com.sky.active.models;

import java.time.Duration;
import java.util.*;

public class WorkoutHistory {
	
	private WorkoutTemplate template;
	private Date workoutDate;
	private Duration workoutTime;
	
	public WorkoutHistory(WorkoutTemplate template, Date workoutDate, Duration workoutTime) {
		this.template = template;
		this.workoutDate = workoutDate;
		this.setWorkoutTime(workoutTime);
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
