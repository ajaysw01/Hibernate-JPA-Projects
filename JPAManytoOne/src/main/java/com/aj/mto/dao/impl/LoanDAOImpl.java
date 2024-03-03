package com.aj.mto.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.aj.mto.dao.LoanDAO;
import com.aj.mto.entity.Loan;

public class LoanDAOImpl implements LoanDAO {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public void savLoan(Loan loan) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			em.merge(loan);
			tx.commit();
			System.out.println("Loan object persisted...");
		}catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}
		

	}

	@Override
	public Loan fecthLoanDetailsById(Integer loanId) {
		EntityManager em = factory.createEntityManager();
		Loan loan = em.find(Loan.class, loanId);
		em.close();
		return loan;
	}

	@Override
	public void removeLoan(Integer loanId) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		try {
			Loan loan = em.find(Loan.class, loanId);
			em.remove(loan);
			tx.commit();
			System.out.println("delelted");
		}catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}finally {
			em.close();
		}

	}

}
