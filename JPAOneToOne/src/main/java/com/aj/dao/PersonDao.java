package com.aj.dao;

import com.aj.oto.entity.Person;

public interface PersonDao {
	
	Person savePerson(Person person);
	Person fetchPersonById(Integer personId);
	

}
