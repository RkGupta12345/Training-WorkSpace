package com.exilant.day2;

public interface IDepartment {
	public void workLocation();
	
	default void noOfHrs()
	{
		System.out.println("Every emp has to work for 10 hrs");
	}
	
	public static void commonUtility()
	{
		System.out.println("All emp has to pass the background verification");
	}

}
