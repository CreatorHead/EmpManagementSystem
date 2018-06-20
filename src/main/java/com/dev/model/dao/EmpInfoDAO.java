package com.dev.model.dao;
import java.util.List;

import com.dev.model.beans.Employee;

public interface EmpInfoDAO {

	public Employee login(String UserId, String UserPassword);
	
	public Employee  searchEmp(String Emp_ID);
	
	public boolean createEmpProfile(Employee emp);
	
	public boolean updateEmp(String Emp_ID);
	
	public List<Employee> empDetails();
	
}