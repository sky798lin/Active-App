package com.sky.active.models;

public class Exercise {
	
	private String name;
	private String description;
	private String equipment;
	private String muscleGroup;
	
	public Exercise(String name, String description, String equipment, String muscleGroup) {
		this.name = name;
		this.description = description;
		this.equipment = equipment;
		this.muscleGroup = muscleGroup;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public String getMuscleGroup() {
		return muscleGroup;
	}

	public void setMuscleGroup(String muscleGroup) {
		this.muscleGroup = muscleGroup;
	}
}
