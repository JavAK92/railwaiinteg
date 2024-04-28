package com.employee.EMS.service;

import java.util.List;
import java.util.Optional;

import com.employee.EMS.Entity.Employee;

public interface EmployeeService {
	
	
	Employee addEmployee(Employee emp);
	
	Employee getemployee(long id);
	
	
	Employee updateemployee(long id,Employee emp);
	
	void deletemployee(long id);
	
	List<Employee> getall();
	

}
