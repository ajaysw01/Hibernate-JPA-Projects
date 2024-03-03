package com.aj.mto.dao;

import com.aj.mto.entity.Loan;

public interface LoanDAO {

	void savLoan(Loan loan);
	
	Loan fecthLoanDetailsById(Integer loanId);
	
	void removeLoan(Integer loanId);
}
