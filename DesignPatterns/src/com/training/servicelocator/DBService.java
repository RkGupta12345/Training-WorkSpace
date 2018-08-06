package com.training.servicelocator;

public class DBService implements Service{

	@Override
	public String getName() {
		return "db";
	}

	@Override
	public void execute() {
		System.out.println("we are executing DB service");
	}

}
