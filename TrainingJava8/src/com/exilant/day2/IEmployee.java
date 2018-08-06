package com.exilant.day2;

public interface IEmployee {
	public void salary();
	
	public default void noOfHrs()
	{
		System.out.println("Every emp has to work for 8 hrs");
	}
}
