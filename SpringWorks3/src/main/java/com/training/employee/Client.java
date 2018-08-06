package com.training.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.basic.HelloService;

public class Client {

	public static void main(String[] args) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("spring-context2.xml");
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml","spring-context2.xml");
		Employee employee=context.getBean("employee",Employee.class);
		
		System.out.println("EmpId==>"+employee.getEmpId());
		System.out.println("Emp Name==>"+employee.getEmpName());
		System.out.println("Emp Sal=>"+employee.getEmpSal());
		System.out.println(employee.hashCode());
		System.out.println("========================");
		
		HelloService helloService1 = (HelloService) context.getBean("defaultHello");
		System.out.println(helloService1.sayHello());
		
//		Employee employee1=context.getBean("employee",Employee.class);
//		System.out.println(employee1.hashCode());
//		System.out.println("EmpId==>"+employee.getEmpId());
//		System.out.println("Emp Name==>"+employee.getEmpName());
//		System.out.println("Emp Sal=>"+employee.getEmpSal());
	context.registerShutdownHook();

	}

}
