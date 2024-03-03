package com.aj.test;

import java.util.List;

import com.aj.dao.EmployeeDAO;
import com.aj.dao.impl.EmployeeDAOImpl;
import com.aj.entity.EmployeeEntity;

public class Tester {

	public static void main(String[] args) {
		
		EmployeeDAO dao = new EmployeeDAOImpl();
		/*
		 * selecting a single employee
		 */
		/*
		EmployeeEntity emp = dao.fetchEmployeeById(7788);
		System.out.println(emp);
		*/
		
		/*
		 * selecting all employees
		 */
//		List<EmployeeEntity> lst = dao.fetchEmployees();
//		lst.forEach(System.out::println);
		
		List<Object[]> lst1 = dao.fetchNamesAndSalaries();
		lst1.forEach(obj -> {
			System.out.println( obj[0]+" , " + obj[1]);
		});
		

	}

}
