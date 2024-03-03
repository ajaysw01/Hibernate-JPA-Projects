package com.aj.dao;

import java.util.List;

import com.aj.entity.EmployeeEntity;

public interface EmpDAO {
	
	List<EmployeeEntity>  executeNamedQuery(int deptNo);
	
	List  executeNamedNativeQuery(int sal);
	
	List<EmployeeEntity> executeCriteriaQuery();

}
