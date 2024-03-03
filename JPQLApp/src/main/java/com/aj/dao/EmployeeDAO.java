package com.aj.dao;

import java.util.List;

import com.aj.entity.EmployeeEntity;


public interface EmployeeDAO {
	EmployeeEntity fetchEmployeeById(Integer empno);
	
	List<EmployeeEntity> fetchEmployees();
	
	List<Object[]> fetchNamesAndSalaries();
	
}