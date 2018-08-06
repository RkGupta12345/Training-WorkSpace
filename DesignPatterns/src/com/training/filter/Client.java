package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		List<Person> list=new ArrayList<Person>();
		
		list.add(new Person("Ravi","male","single"));
		list.add(new Person("Kumar","male","single"));
		list.add(new Person("Raja","male","married"));
		list.add(new Person("Rohit","male","married"));
		list.add(new Person("Puja","female","single"));
		list.add(new Person("Rashmi","female","married"));
		
		ICriteria maleCriteria=new Male();
		
		System.out.println("==========only male============");
		maleCriteria.meetCriteria(list).forEach(System.out::println);
		
		ICriteria femaleCriteria=new Female();
		
		System.out.println("==========only female============");
		femaleCriteria.meetCriteria(list).forEach(System.out::println);
		
		ICriteria marriedCriteria=new Married();
		
		System.out.println("==========only Married============");
		marriedCriteria.meetCriteria(list).forEach(System.out::println);
		
		ICriteria singleCriteria=new Single();
		
		System.out.println("==========only Single============");
		singleCriteria.meetCriteria(list).forEach(System.out::println);
		
		ICriteria maleMarried=new MaleMarried();
		
		System.out.println("==========Male Married============");
		maleMarried.meetCriteria(list).forEach(System.out::println);
		
		ICriteria femaleMarried=new FemaleMarried();

		
		System.out.println("==========FEMale Married============");
		femaleMarried.meetCriteria(list).forEach(System.out::println);
		
		ICriteria orCriteria=new OrCriteria(maleCriteria, femaleMarried);

		
		System.out.println("==========OR Criteria============");
		orCriteria.meetCriteria(list).forEach(System.out::println);
		
		ICriteria andCriteria=new AndCriteria(maleCriteria, maleMarried);

		
		System.out.println("==========And Criteria============");
		andCriteria.meetCriteria(list).forEach(System.out::println);
		
		ICriteria negateCriteria=new NegateCriteria(maleCriteria);

		
		System.out.println("==========Negate Criteria============");
		negateCriteria.meetCriteria(list).forEach(System.out::println);
	}

}
