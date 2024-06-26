package com.aj.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.aj.constants.AppConstants;
import com.aj.dao.EmployeeDAO;
import com.aj.entity.EmployeeEntity;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");
	

	@Override
	public EmployeeEntity fetchEmployeeById(Integer empno) {
		EntityManager em = factory.createEntityManager();
		TypedQuery<EmployeeEntity> tq = em.createQuery(AppConstants.QUERY1, EmployeeEntity.class);
		tq.setParameter(1, empno);
		EmployeeEntity e = tq.getSingleResult();
		em.close();
		return e;
	}

	@Override
	public List<EmployeeEntity> fetchEmployees() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<EmployeeEntity> tq = em.createQuery(AppConstants.QUERY2, EmployeeEntity.class);
		List<EmployeeEntity> lstOfEmployees = tq.getResultList();
		em.close();
		return lstOfEmployees;
	}

	@Override
	public List<Object[]> fetchNamesAndSalaries() {
		EntityManager em = factory.createEntityManager();
		TypedQuery<Object[]> tq = em.createQuery(AppConstants.QUERY3, Object[].class);
		List<Object[]> lst = tq.getResultList();
		em.close();
		return lst;
			
	}

}
