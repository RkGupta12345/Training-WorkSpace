package com.training.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.training.employee.Employee;

// if you want spring to know this is post processor
// implements BeanPostprocessor
//since this class can handle any class/all are given as object
public class EmployeeBeanPostProcessor implements BeanPostProcessor{

	public Object postProcessBeforeInitialization(Object arg0, String beanName) throws BeansException {
		System.out.println("***********PostProcessBeforeInitialization********==>");
		if(arg0 instanceof Employee) {
			Employee emp=(Employee) arg0;
			emp.setEmpName(emp.getEmpName().toUpperCase());
			return emp;
		}
		return arg0;
	}

	public Object postProcessAfterInitialization(Object arg1, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization=>");
		return arg1;
	}
	

}
