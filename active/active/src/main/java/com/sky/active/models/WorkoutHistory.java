package com.sky.active.models;

import java.time.Duration;
import java.util.*;

public class WorkoutHistory {
	
	public WorkoutTemplate template;
	public Duration workoutTime;
	public Date workoutDate;
	
	public WorkoutHistory(WorkoutTemplate template, Duration workoutTime, Date workoutDate) {
		this.template = template;
		this.workoutTime = workoutTime;
		this.workoutDate = workoutDate;
	}
}
