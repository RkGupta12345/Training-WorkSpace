package com.exilant.day1;

import java.util.Arrays;
import java.util.List;

public class LambdaBasic02 {

	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(10,20,30,40,50,60);
		
		//< jdk1.5
		int sum=0;
		for(int i=0;i<numbers.size();i++)
		{
			System.out.println(numbers.get(i));
			 sum=sum+numbers.get(i);
		}
		System.out.println("Sum is::" +sum);
		
	
	
	System.out.println("------------post jdk1.8---------------");
	//till jdk1.7
	int result=0;
	for(int temp:numbers)
	{
		result=result+temp*2;
	}
	System.out.println("Result::"+result);
	
	System.out.println(
			numbers.stream().
			map(e->e*2).
			 reduce((res ,e)->res+e)
			);
	System.out.println();
	
	
}

}
