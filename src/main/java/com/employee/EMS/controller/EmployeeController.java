package com.employee.EMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.EMS.DTO.empDTO;
import com.employee.EMS.Entity.Employee;
import com.employee.EMS.service.EmployeeService;

@RestController
@RequestMapping("/api/v4/employee")
public class EmployeeController {
	
	List<empDTO> empdlist;

	private EmployeeService empservice;
	
	public EmployeeController(EmployeeService empservice)
	{
		this.empservice=empservice;
	}
	

	
	@GetMapping("/{id}")
	public empDTO getsingle(@RequestParam long id )
	{
		Employee emp = empservice.getemployee(id);
		empDTO emps = new empDTO();
		//emps.setId(emp.getId());
		emps.setFirstname(emp.getFirstname());
		emps.setLastname(emp.getLastname());
		emps.setEmaild(emp.getEmaild());
		
		return emps;
		
		//return empservice.getemployee(id);
		
	}
	
	@GetMapping("/all")
	public List<empDTO> getall()
	{
		
		List<Employee> emplist= empservice.getall();
		
		empDTO empd = new empDTO();
		for(Employee e:emplist)
		{
			//empd.setId(e.getId());
			empd.setFirstname(e.getFirstname());
			empd.setLastname(e.getLastname());
			empd.setEmaild(e.getEmaild());
			empdlist.add(empd);
			
			
		}
		
		return empdlist;
		
	}
	
	@DeleteMapping("/{id}")
	public void deletesingle(@RequestParam long id)
	{
		 empservice.deletemployee(id);
	}
	@PostMapping("/add-new")
	public empDTO addnewone(@RequestBody Employee emp)
	{
		Employee emp1 = empservice.addEmployee(emp);
		empDTO emp2 = new empDTO();
		//emp2.setId(emp1.getId());
		emp2.setFirstname(emp1.getFirstname());
		emp2.setLastname(emp1.getLastname());
		emp2.setEmaild(emp1.getEmaild());
		
		return emp2;
	}
	
	@PutMapping("/update/{id}")
	public empDTO updateemp(@RequestBody Employee emp, @RequestParam long id)
	{
		Employee emp1= empservice.updateemployee(id, emp);
		empDTO emp2 = new empDTO();
		//emp2.setId(emp1.getId());
		emp2.setFirstname(emp1.getFirstname());
		emp2.setLastname(emp1.getLastname());
		emp2.setEmaild(emp1.getEmaild());
		return emp2;
	
	}

}
