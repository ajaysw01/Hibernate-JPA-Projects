package com.aj.test;

import java.time.LocalDate;

import com.aj.dao.PersonDao;
import com.aj.dao.imp.PersonDaoImpl;
import com.aj.oto.entity.Passport;
import com.aj.oto.entity.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonDao dao = new PersonDaoImpl();
		
		/*
		 * calling save Person methdo
		 */
		Passport passport = new Passport();
		passport.setPassportId(2121);
		passport.setExpireDate(LocalDate.MAX);
		
		
		Person person = new Person();
		person.setPersonId(101);
		person.setPersonName("Ajay");
		person.setPassport(passport);
		
		dao.savePerson(person);
		
		/*
		 * calling fetch method
		 */
		

	}

}
