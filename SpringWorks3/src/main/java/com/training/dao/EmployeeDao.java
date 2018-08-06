package com.training.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.training.employee.Employee;
import com.training.interfaces.IEmployeeDao;
import com.training.mappers.EmployeeMapper;

public class EmployeeDao implements IEmployeeDao{
	
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public Employee getEmployee(int empId) {
		String sql="select empid,empname,empsal from employee where empid=?";
		
		//Employee employee=jdbcTemplateObject.queryForObject(sql,new Object[] {empId},new BeanPropertyRowMapper<Employee>(Employee.class) );
		
		
		Employee employee1=jdbcTemplateObject.queryForObject(sql,new Object[] {empId},new EmployeeMapper());
		return employee1;
	}

	public List<Employee> getAllEmps() {
		String sql="select empid,empname,empsal from employee";
		List<Employee> list=new ArrayList<Employee>();
		List<Map<String,Object>> rows=jdbcTemplateObject.queryForList(sql);
		
		for(Map row:rows) {
			Employee employee=new Employee();
			employee.setEmpId(Integer.parseInt(row.get("empid").toString()));
			employee.setEmpSal(Double.parseDouble(row.get("empsal").toString()));
			employee.setEmpName(row.get("empname").toString());
			list.add(employee);
			
		}
		
		return list;
	}

	public void insertEmployee(Employee employee) {
		String sql="insert into employee (empid,empname,empsal)" +"values(?,?,?)";
		
		jdbcTemplateObject.update(sql,employee.getEmpId(),employee.getEmpName(),employee.getEmpSal());
		
		System.out.println("Record created==>"+employee);
		
		
	}

	public void deletEmployee(int empId) {
		
		
	}

	public void updateEmployee(int empId, double empNewSalary) {
		// TODO Auto-generated method stub
		
	}

	public void setDataSource(DataSource dataSource) {
		// this will be injected by configuration file
		this.dataSource=dataSource;
		this.jdbcTemplateObject=new JdbcTemplate(dataSource);
		
	}

}
