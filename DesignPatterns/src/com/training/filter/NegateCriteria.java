package com.training.filter;

import java.util.List;

public class NegateCriteria implements ICriteria{
	private ICriteria negate;

	public NegateCriteria(ICriteria negate) {
		super();
		this.negate = negate;
	}

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> neList=negate.meetCriteria(persons);
		persons.removeAll(neList);
		return persons;
	}
	
	

}
