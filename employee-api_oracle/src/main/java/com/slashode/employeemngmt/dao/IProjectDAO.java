package com.slashode.employeemngmt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slashode.employeemngmt.dto.Project;

@Repository
public interface IProjectDAO extends JpaRepository<Project, Integer> {

	List<Project> findByEmployeeEmpId(int empId);

}
