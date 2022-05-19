package com.sky.active.models;

import java.util.*;

public class WorkoutHistory {
	
	private WorkoutTemplate template;
	private Date workoutDate;
	
	public WorkoutHistory(WorkoutTemplate template, Date workoutDate) {
		this.template = template;
		this.workoutDate = workoutDate;
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
}
