package com.slashode.employeemngmt.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Employee {

	@Id
	@GeneratedValue
	private int empId;
	private String empName;
	private String deptName;
		
}
