package com.training.composite;

public class Client {

	public static void main(String[] args) {
		Customer customer1=new Customer(101, "Suraj");
		Customer customer2=new Customer(102, "Ravi");
		Customer customer3=new Customer(103, "Rohit");
		Customer customer4=new Customer(104, "Santosh");
		Customer customer5=new Customer(105, "Raj");
		Customer customer6=new Customer(106, "Saurav");
		Customer customer7=new Customer(107, "rajeev");
		Customer customer8=new Customer(108, "Roy");
		Customer customer9=new Customer(109, "Uma");
		
		customer1.addReference(customer2);
		customer1.addReference(customer3);
		customer1.addReference(customer4);
		
		customer2.addReference(customer5);
		customer2.addReference(customer6);
		
		customer4.addReference(customer7);
		customer4.addReference(customer8);
		customer4.addReference(customer9);
		
		System.out.println("Print all customer reference tree");
		System.out.println("Customer1's Reference==>"+customer1.getCustName());
		
		for(Customer temp:customer1.getReferences())
		{
			System.out.println(temp.getCustId()+","+temp.getCustName());
		}
		
		customer1.removeReference(customer2);
		
System.out.println("Customer1's Reference==>"+customer1.getCustName());
		
		for(Customer temp:customer1.getReferences())
		{
			System.out.println(temp.getCustId()+","+temp.getCustName());
		}

	}

}
