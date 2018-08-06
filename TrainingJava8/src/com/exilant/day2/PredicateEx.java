package com.exilant.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
// program to show working of predicate
public class PredicateEx {

	public static void main(String[] args) {
//		Predicate< Integer> greaterThan=i->i>10;
//		Predicate< Integer> lessThan=i->i<10;
//		
//		Predicate<Integer> positiveNumbers=i->i>0;
//		Predicate<Integer> betweenRange=i->i>0 && i<100;
//		
//		System.out.println(greaterThan.test(5));
//		
//		List<Integer> integerList=Arrays.asList(12,23,34,45,-33,55,-55,3,6,77,100,200,300);
//		// passing single predicate
//		List<Integer> greaterThan10List= filteredlist(integerList, greaterThan);
//		greaterThan10List.forEach(System.out::println);
//		
//		// we can have  compound predicate passed
//		Predicate<Integer> compoundPredicate=positiveNumbers.and(betweenRange);
//		List<Integer> compoundList=filteredlist(integerList, compoundPredicate);
//		System.out.println("----------list of values compound predicate-----");
//		
//		compoundList.forEach(System.out::println);
//		
//		
//	}
	
	List<Person> personList=Arrays.asList(
			new Person(101,"Ravi"),
			new Person(102,"Ankit"),
			new Person(103,"Raja"),
			new Person(104,"Suman")
			
			);
	
	Predicate< Person> greaterThan=i->i.getpId()>101;
	Predicate< Person> lessThan=i->i.getpId()<102;
	
	Predicate<Person> positiveNumbers=i->i.getpId()>102;
	Predicate<Person> betweenRange=i->i.getpId()>101 && i.getpId()<104;
	
	List<Person> greaterThan10List= filteredlist(personList, greaterThan);
	greaterThan10List.forEach(System.out::println);
	
	// we can have  compound predicate passed
	Predicate<Person> compoundPredicate=positiveNumbers.and(betweenRange);
	List<Person> compoundList=filteredlist(personList, compoundPredicate);
	System.out.println("----------list of values compound predicate-----");
	
	compoundList.forEach(System.out::println);
	
	
//	public static List<Integer> filteredlist(List<Integer> numbers, Predicate<Integer> predicate)
//	{
//		List<Integer> filteredList =new ArrayList<Integer>();
//		
//		for(Integer temp: numbers) {
//			if(predicate.test(temp)) {
//				filteredList.add(temp);
//			}
//		}
//		return filteredList;
	}

	
	public static List<Person> filteredlist(List<Person> numbers, Predicate<Person> predicate)
	{
		List<Person> filteredList =new ArrayList<Person>();
		
		for(Person temp1: numbers) {
			if(predicate.test(temp1)) {
				filteredList.add(temp1);
			}
		}
		return filteredList;
	}


}
