package com.slashode.employeemngmt.service;

import java.util.List;

import com.slashode.employeemngmt.dto.*;

public interface IProjectService {

	List<Project> getProjectList(int empId);

	Project getProjectById(int id);

	void addProject(Project proj);

	void updateProj(Project proj);

	void deleteProjectById(int id);

	List<Project> getAllProject();
}
