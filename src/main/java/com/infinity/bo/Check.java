package com.infinity.bo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Check {
	
	/*
	 * Unique identifier
	 */
	@JsonProperty("_id")
	private String checkId;
	
	/*
	 * Name of the check. Example is "Dairy Temperature Check".
	 */
	private String name;
	
	/*
	 * Department. Example is "Dairy".
	 */
	private String department;
	
	/*
	 * Language. Example is "US-English".
	 */
	private String language;
	
	/*
	 * Sub checks/items. Examples are "Yogurt, cookie dough etc."
	 */
	private String[] subChecks;
	
	/*
	 * Critical limit. Example is "Greater than 4 degrees"
	 */
	private String criticalLimit;
	
	/*
	 * Corrective action. Example is "Remove"
	 */
	private String correctiveAction;
	
	public String getCheckId() {
		return checkId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String[] getSubChecks() {
		return subChecks;
	}

	public void setSubChecks(String[] subChecks) {
		this.subChecks = subChecks;
	}

	public String getCriticalLimit() {
		return criticalLimit;
	}

	public void setCriticalLimit(String criticalLimit) {
		this.criticalLimit = criticalLimit;
	}

	public String getCorrectiveAction() {
		return correctiveAction;
	}

	public void setCorrectiveAction(String correctiveAction) {
		this.correctiveAction = correctiveAction;
	}

	public void setCheckId(String checkId) {
		this.checkId = checkId;
	}

}
