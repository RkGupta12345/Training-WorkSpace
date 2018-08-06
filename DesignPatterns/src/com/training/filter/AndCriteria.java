package com.training.filter;

import java.util.List;

public class AndCriteria implements ICriteria{
	
	private ICriteria firstCriteria;
	private ICriteria secondCriteria;
	
	public AndCriteria(ICriteria firstCriteria, ICriteria secondCriteria) {
		super();
		this.firstCriteria = firstCriteria;
		this.secondCriteria = secondCriteria;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> andList=firstCriteria.meetCriteria(persons);
		return secondCriteria.meetCriteria(andList);
	}
	
	

}
