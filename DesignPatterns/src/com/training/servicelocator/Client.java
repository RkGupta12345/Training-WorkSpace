package com.training.servicelocator;

public class Client {

	public static void main(String[] args) {
		Service dbService = ServiceLocator.getService("db");
		dbService.execute();
		System.out.println("=====================");

		dbService = ServiceLocator.getService("db");
		dbService.execute();

		System.out.println("=====================");

		Service erpService = ServiceLocator.getService("erp");
		erpService.execute();
		
		System.out.println("=====================");
		
		erpService = ServiceLocator.getService("erp");
		erpService.execute();

		System.out.println("=====================");

		erpService = ServiceLocator.getService("erp");
		erpService.execute();
	}

}
