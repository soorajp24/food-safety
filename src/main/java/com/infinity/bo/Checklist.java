package com.infinity.bo;

import java.util.Date;

public class Checklist {
	
	/*
	 * Name of the checklist. Example is "Frozen Temp Check"
	 */
	private String name;
	
	/*
	 * To be completed By. Example is "Associate"
	 */
	private String completedBy;
	
	/*
	 * Scheduled execution Time. Example is "between 6AM to 11PM" , "at 8:00AM"
	 */
	private Date executionTime;
	
	/*
	 * Recurrence Frequency. Example is 2hours, daily, weekly, monthly.
	 */
	private String frequency;
	
	/*
	 * Department. Example is "Frozen", "Food Safety" etc.
	 */
	private String department;
	
	/*
	 * Auto Spawn. Example is "Yes" or "No"
	 */
	private String autoSpawn;
	
	/*
	 * Checklist Action. Example is "Not available"
	 */
	private String action;
	
	/*
	 * Create Alerts. Example is "Yes" or "No". This won't go as part of checklists in handheld.
	 */
	private String createAlerts;
	
	private Check[] checks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompletedBy() {
		return completedBy;
	}

	public void setCompletedBy(String completedBy) {
		this.completedBy = completedBy;
	}

	public Date getExecutionTime() {
		return executionTime;
	}

	public void setExecutionTime(Date executionTime) {
		this.executionTime = executionTime;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getAutoSpawn() {
		return autoSpawn;
	}

	public void setAutoSpawn(String autoSpawn) {
		this.autoSpawn = autoSpawn;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getCreateAlerts() {
		return createAlerts;
	}

	public void setCreateAlerts(String createAlerts) {
		this.createAlerts = createAlerts;
	}

	public Check[] getChecks() {
		return checks;
	}

	public void setChecks(Check[] checks) {
		this.checks = checks;
	}


}
