package com.training.interfaces;

import java.util.List;

import javax.sql.DataSource;

import com.training.employee.Employee;

public interface IEmployeeDao {
	
	public Employee getEmployee(int empId);
	
	public List<Employee> getAllEmps();
	
	public void insertEmployee(Employee employee);
	
	public void deletEmployee(int empId);
	
	public void updateEmployee(int empId,double empNewSalary);
	
	public void setDataSource(DataSource dataSource);

}
