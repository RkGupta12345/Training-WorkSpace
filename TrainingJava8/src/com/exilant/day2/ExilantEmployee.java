package com.exilant.day2;

public class ExilantEmployee implements IEmployee,IDepartment{

	@Override
	public void salary() {
		System.out.println("The Salary is decided by the project you work");
		
	}

	@Override
	public void noOfHrs() {
		IDepartment.super.noOfHrs();
	}

	@Override
	public void workLocation() {
		System.out.println("work location");
	}

}
