package com.training.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.employee.Employee;
import com.training.interfaces.IEmployeeDao;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("db-context.xml");
		
		IEmployeeDao employeeDao=(IEmployeeDao) context.getBean("employeeDaoTemplate");
		
		Employee employee1=new Employee(101, "Ravi", 63000);
		Employee employee2=new Employee(102, "Rajesh", 23000);
		Employee employee3=new Employee(103, "Rakesh", 13000);
		Employee employee4=new Employee(104, "Raju", 33000);
		
		employeeDao.insertEmployee(employee1);
		employeeDao.insertEmployee(employee2);
		employeeDao.insertEmployee(employee3);
		employeeDao.insertEmployee(employee4);
	}

}
