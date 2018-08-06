package com.exilant.day2;

import java.util.Arrays;
import java.util.List;

public class PersonClient {

	public static void main(String[] args) {
		List<Person> personList=Arrays.asList(
			new Person(101,"Ravi"),
			new Person(102,"Ankit"),
			new Person(103,"Raja"),
			new Person(104,"Suman")
			
			);
		personList.forEach(System.out::println);
		PersonConsumer print=new PersonConsumer();
		personList.forEach(print);
		
		System.out.println("---------------------");
		personList.forEach(PrintConsumer::print);
		
		}
	}


