package com.aj.otm.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.aj.otm.dao.CategoryDao;
import com.aj.otm.entities.CategoryEntity;

public class CategoryDaoImpl implements CategoryDao{

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("hibernatedemo");
	
	@Override
	public void saveCategory(CategoryEntity entity) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.persist(entity);
			tx.commit();
			System.out.println("Category with products are persisted");
			
		}catch (Exception e) {
			tx.rollback();
			System.out.println("Something occurred");
		}
		
	}

	@Override
	public CategoryEntity fetchCategory(Integer categoryId) {
		EntityManager em = factory.createEntityManager();
		CategoryEntity entity = em.find(CategoryEntity.class, categoryId);
		em.close();
		return entity;
	
	}

	@Override
	public void removeCategory(Integer categoryId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		CategoryEntity entity = em.find(CategoryEntity.class,categoryId);
		tx.begin();
		try {
			em.remove(entity);
			tx.commit();
			System.out.println("Category removed");
		}catch (Exception e) {
			tx.rollback();
			System.out.println("Can't be removed");
			
		}
	}
	

}
