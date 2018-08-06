package com.training.object;

import java.util.Map;

import org.apache.kafka.common.serialization.Serializer;

public abstract  class Employee implements Serializer{
	private int empId;
	private String empName;
	private String empAddress;

	public Employee() {

	}

	public Employee(int empId, String empName, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	
	@Override
	public void close() {
		
		
	}

}
