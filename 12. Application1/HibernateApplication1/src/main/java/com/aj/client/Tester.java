package com.aj.client;

import com.aj.dao.StudentDAO;
import com.aj.dao.impl.StudentDAOImpl;
import com.aj.entity.Student;

public class Tester {

	public static void main(String[] args) {
		
		StudentDAO  dao = new StudentDAOImpl();
		
		/*
		 * creating Student object
		 */
		/*
		Student student = new Student();
		student.setSid(22022);
		student.setSname("SUNNY");
		student.setGender("Male");
		student.setMarks(500);
		dao.saveStudent(student);
		*/
		
		
		/*
		Student stud = dao.loadStudent(11012);
		System.out.println(stud);
		*/
		
		/*
		Student s = dao.updateStudent(11011, 799);
		System.out.println(s);
		*/
		
		dao.deleteStudent(22022);
		
		
		
	}

}



