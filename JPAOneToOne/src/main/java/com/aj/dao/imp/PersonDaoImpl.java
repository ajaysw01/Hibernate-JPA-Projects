package com.aj.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.aj.dao.PersonDao;
import com.aj.oto.entity.Person;

public class PersonDaoImpl implements PersonDao {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
	

	@Override
	public Person savePerson(Person person) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.persist(person);
			tx.commit();
			System.out.println("Person object is persited successfully....");
		}catch (Exception e) {
			System.out.println("Not persisted");
			tx.rollback();
		}
		
		return person;
	}

	@Override
	public Person fetchPersonById(Integer personId) {
		EntityManager em = factory.createEntityManager();
		Person per = em.find(Person.class, personId);
		System.out.println("Person Name "+ per.getPersonName());
		System.out.println("Person Passport"+ per.getPassport());
		return null;
	}

}
