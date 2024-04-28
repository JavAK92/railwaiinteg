package com.employee.EMS.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.employee.EMS.EMPRepository.EMSRepository;
import com.employee.EMS.Entity.Employee;
import com.employee.EMS.Exception.ResourceNotFoundException;
import com.employee.EMS.service.EmployeeService;

@Service
public class EmplyeeImpl implements EmployeeService {
	
	
	
	private EMSRepository emprepository;
	
	public EmplyeeImpl(EMSRepository emprepository)
	{
		
		this.emprepository=emprepository;
	}

	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return emprepository.save(emp);
		
	}

	
	@Override
	public Employee getemployee(long id) {
		// TODO Auto-generated method stub
		return emprepository.findById(id).orElseThrow(() ->new ResourceNotFoundException("Resource Not Found"));
		
	}

	@Override
	public Employee updateemployee(long id, Employee emp) {
		// TODO Auto-generated method stub
		return emprepository.save(emp);
		
	}

	@Override
	public void deletemployee(long id) {
		// TODO Auto-generated method stub
		 emprepository.deleteById(id);
		
	}
	
	public List<Employee> getall()
	{
		
		return emprepository.findAll();
	}

}
