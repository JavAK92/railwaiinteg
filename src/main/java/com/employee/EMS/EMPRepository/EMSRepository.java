package com.employee.EMS.EMPRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.EMS.Entity.Employee;

public interface EMSRepository extends JpaRepository<Employee,Long> {

}
