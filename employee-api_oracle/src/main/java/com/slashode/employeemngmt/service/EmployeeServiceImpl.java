package com.slashode.employeemngmt.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slashode.employeemngmt.dao.IEmployeeDAO;
import com.slashode.employeemngmt.dto.Employee;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	List<Employee> empList =new ArrayList<>(Arrays.asList(
			new Employee(1,"Rohan","Payments"),
			new Employee(2,"Rohit","DSOS"),
			new Employee(3,"Ritha","PCF")));

	@Autowired
	private IEmployeeDAO daoRef;
	
	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		//return empList;
		return daoRef.findAll();
	}

	@Override
	public Employee getEmployeeById(int empId) {
		//return empList.stream().filter(e -> e.getEmpId() == empId).findFirst().get();
		return daoRef.getOne(empId);
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		//empList.add(employee);
		daoRef.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee, int empId) {
		/*for(int i=0; i<empList.size(); i++) {
			Employee e = empList.get(i);
			if(e.getEmpId()==empId) {
				empList.set(i, employee);
				return;
			}
		}*/
		daoRef.save(employee);
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		//empList.removeIf(e -> e.getEmpId() == empId);
		daoRef.deleteById(empId);
	}

	@Override
	public List<Employee> getEmployeeByDept(String deptName) {
		// TODO Auto-generated method stub
		return daoRef.findByDeptName(deptName);
	}


	

}
