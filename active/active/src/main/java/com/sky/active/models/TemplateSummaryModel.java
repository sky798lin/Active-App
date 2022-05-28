package com.sky.active.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TemplateSummaryModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private WorkoutTemplate[] templates;
	
	public TemplateSummaryModel() {
		
	}
	
	public TemplateSummaryModel(WorkoutTemplate[] templates) {
		this.templates = templates;
	}

	public Integer getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public WorkoutTemplate[] getTemplates() {
		return templates;
	}

	public void setTemplates(WorkoutTemplate[] templates) {
		this.templates = templates;
	}
}
