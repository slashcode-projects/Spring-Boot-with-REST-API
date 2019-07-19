package com.slashode.employeemngmt.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Project {

	@Id
	private int projectId;
	private String projectName;
	
	@ManyToOne
	private Employee employee;
	
	public Project() {
		
	}

	
	public Project(int projectId, String projectName, int empId) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.employee = new Employee(empId,"","");
	}


	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
