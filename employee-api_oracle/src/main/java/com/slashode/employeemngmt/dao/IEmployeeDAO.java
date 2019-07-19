package com.slashode.employeemngmt.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.slashode.employeemngmt.dto.Employee;

@Repository
public interface IEmployeeDAO extends JpaRepository<Employee, Integer> {

	List<Employee> findByDeptName(String deptName);
}
