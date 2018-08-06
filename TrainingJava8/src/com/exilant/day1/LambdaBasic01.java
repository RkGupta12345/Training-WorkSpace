package com.exilant.day1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaBasic01 {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(10,20,30,40,50,60);
		
		//< jdk1.5
		
		for(int i=0;i<numbers.size();i++)
		{
			System.out.println(numbers.get(i));
		}
		
		System.out.println("------------post jdk1.8---------------");
		//till jdk1.7
		
		for(Integer temp:numbers)
		{
			System.out.println(temp);
		}
		
		//from jdk1.8 with lambda
		System.out.println("----- jdk1.8 with lambda-----");
		
		numbers.forEach((Integer temp) -> System.out.println(temp));
		
		//behind the screen
		
		System.out.println("------with consumer-------");
		numbers.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
	
		// in lambda way 1.8
		System.out.println("---in lambda way 1----------");
		numbers.forEach((temp)->System.out.println(temp));
		
		//this is called as method references
		
		System.out.println("---------in lambda way 2-----");
		numbers.forEach(System.out:: println);
		
		
		
	}

}
