package com.sky.active.models;

public class TemplateSummaryModel {
	
	private WorkoutTemplate[] templates;
	
	public TemplateSummaryModel(WorkoutTemplate[] templates) {
		this.templates = templates;
	}

	
	public WorkoutTemplate[] getTemplates() {
		return templates;
	}

	public void setTemplates(WorkoutTemplate[] templates) {
		this.templates = templates;
	}
}
