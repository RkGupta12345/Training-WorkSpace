package com.exilant.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// to show working of map and filter based on the customer type
public class StreamMapEx02 {
	
	
	//syntax is upto jdk1.7
	
	public static List<PriorityCustomer> filterCustomers(List<Customer> customers)
	{
		List<PriorityCustomer> priorityCustomers=new ArrayList<>();
		for(Customer temp:customers)
		{
			if(temp.getCustomerPurchases()>5000)
			{
				priorityCustomers.add(new PriorityCustomer
						(temp.getCustomerId(),
							temp.getCustomerName()));
			}
		}
		return priorityCustomers;
	}
	
	//In java 8 way
	
	public static List<PriorityCustomer> filterCustomers1(List<Customer> customers){
		List<PriorityCustomer> priorityCustomers=customers.stream().map(tem->{
			if(tem.getCustomerPurchases()>5000) {
				return new PriorityCustomer(tem.getCustomerId(), 
						tem.getCustomerName());
		}
			return null;
		}).collect(Collectors.toList());
		return priorityCustomers;
		
	}	
	////////////////////////////////////////////////////////////

	 public static List<PriorityCustomer> filterCustomers2(List<Customer> customers){
		 return
				 customers.stream().filter(temp2->temp2.getCustomerPurchases()>5000)
				 .map(temp2->{
					 return new PriorityCustomer(temp2.getCustomerId(),
							 temp2.getCustomerName());
				 }).collect(Collectors.toList());
	 }
	 
	 public static List<PriorityCustomer> filterCustomers3(List<Customer> customers){
		 List<PriorityCustomer> priorityCustomers=customers.stream().map(temp3->{
		 return new PriorityCustomer(temp3.getCustomerId(),
				 temp3.getCustomerName(),
				 temp3.getCustomerPurchases()>0 &&
				 temp3.getCustomerPurchases()<3000?"Gold":
					 temp3.getCustomerPurchases()>3000 && 
					 temp3.getCustomerPurchases()<5000 ?"Platinum":"Silver");
					 
		 }).collect(Collectors.toList());
		 return priorityCustomers;
	 }
	 
	public static void main(String[] args) {
		List<Customer> customers=Arrays.asList(
				new Customer(101,"Ramu",4000,"Engineer"),
				new Customer(102,"Ravi",7000,"developer"),
				new Customer(103,"Raja",5000,"Engineer"),
				new Customer(104,"Anuj",8000,"Engineer"),
				new Customer(105,"Ankit",9000,"Tester")
				);
		filterCustomers(customers).forEach(System.out::println);
		filterCustomers1(customers).forEach(System.out::println);
		filterCustomers3(customers).forEach(System.out::println);
				
	}

}
