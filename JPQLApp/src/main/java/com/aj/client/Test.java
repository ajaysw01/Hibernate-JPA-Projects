package com.aj.client;

import java.util.List;

import com.aj.dao.EmployeeDAO;
import com.aj.dao.impl.EmployeeDAOImpl;
import com.aj.entity.EmployeeEntity;

public class Test {
	public static void main(String[] args) {
		EmployeeDAO dao = new EmployeeDAOImpl();
		
		/*
		 * Selecting single employee
		 */
		EmployeeEntity emp = dao.fetchEmployeeById(101);
		System.out.println(emp);
				
		/*
		 * selecting all employees
		 */
//		List<EmployeeEntity> lst = dao.fetchEmployees();
//		lst.forEach(System.out :: println);
		
		
				
	}

}
