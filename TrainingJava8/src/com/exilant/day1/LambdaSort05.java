package com.exilant.day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//program to show working of camparator with Lambda
public class LambdaSort05 {

	public static void main(String[] args) {
		List<Customer> customers=Arrays.asList(
				new Customer(101,"Ramu",4000,"Engineer"),
				new Customer(102,"Ravi",7000,"Developer"),
				new Customer(103,"Raja",5000,"Engineer"),
				new Customer(104,"Anuj",8000,"Engineer"),
				new Customer(105,"Ankit",9000,"Tester")
				);
		System.out.println("------------Before Start--------------");
		customers.forEach(System.out::println);
		// jdk 1.7 version or older
		
		Collections.sort(customers, new Comparator<Customer>()
				{

					@Override
					public int compare(Customer o1, Customer o2) {
						return o1.getCustomerName().compareTo(o2.getCustomerName());
					}
			
				});
		
		System.out.println("------------- Afetr sorting on Name----------");
		customers.forEach(System.out:: println);
		
		// java 8 way
		
		System.out.println("------After sorting on purchase------------");
		
		customers.sort((Customer c1, Customer c2)
				-> (int)(c1.getCustomerPurchases() - c2.getCustomerPurchases()));
		customers.forEach(System.out:: println);
		
		// java 8 way
		System.out.println("Afetr sorting on designation(asc)");
		
		customers.sort(( c1,  c2)
				-> c1.getDesignation() .compareTo(c2.getDesignation()) );
		customers.forEach(System.out:: println);
		
		Comparator<Customer> customerNameAscComparator=(c1,c2)->
		c1.getCustomerName().compareTo(c2.getCustomerName());
		
		Collections.sort(customers, customerNameAscComparator);
		System.out.println("----------Afetr sort on Name(ASc)-------------");
		customers.forEach(System.out:: println);
		
		customers.sort(customerNameAscComparator.reversed());
		System.out.println("----------Afetr sort Name on desc---------------");
		customers.forEach(System.out:: println);
		
	}

}
