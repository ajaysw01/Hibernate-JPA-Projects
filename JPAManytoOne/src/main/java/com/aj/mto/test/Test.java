package com.aj.mto.test;

import com.aj.mto.dao.LoanDAO;
import com.aj.mto.dao.impl.LoanDAOImpl;
import com.aj.mto.entity.Customer;
import com.aj.mto.entity.Loan;

public class Test {

	public static void main(String[] args) {
		
		LoanDAO dao = new LoanDAOImpl();
		/*
		 * Invoking saveLoan()
		 */
		
		Loan pLoan = new Loan();
		pLoan.setLoanId(101);
		pLoan.setLoanType("Personal Loan");
		pLoan.setAmount(5000.00);
		
		
		Loan hLoan = new Loan();
		hLoan.setLoanId(121);
		hLoan.setLoanType("House Loan");
		hLoan.setAmount(510000.00);
		
		Loan vLoan = new Loan();
		vLoan.setLoanId(131);
		vLoan.setLoanType("Vehicle Loan");
		vLoan.setAmount(510.00);
		
	
		Customer customer = new Customer();
		customer.setCustomerId(13);
		customer.setCustomerName("vijay");
		
		
		dao.savLoan(pLoan);
		dao.savLoan(vLoan);
		dao.savLoan(hLoan);
		
		
		/*
		 * calling removeLoan)()
		 */
		//dao.removeLoan(101);
		
		
		/*
		 * calling fetchLoan()
		 */
		//dao.fecthLoanDetailsById(101);
	}

}
