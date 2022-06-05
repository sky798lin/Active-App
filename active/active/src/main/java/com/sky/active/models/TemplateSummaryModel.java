package com.sky.active.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TemplateSummaryModel {
	
	@Id
	private Integer id = 1;
	private WorkoutTemplate[] templates;
	
	public TemplateSummaryModel() {
		
	}
	
	public TemplateSummaryModel(WorkoutTemplate[] templates) {
		this.templates = templates;
	}
	

	public Integer getId() {
		return id;
	}
	
	public WorkoutTemplate[] getTemplates() {
		return templates;
	}

	public void setTemplates(WorkoutTemplate[] templates) {
		this.templates = templates;
	}
}
