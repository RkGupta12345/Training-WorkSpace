package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class FemaleMarried implements ICriteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> femaleMarried=new ArrayList<Person>();
		for(Person temp:persons) {
			if(temp.getSex().equals("female") && temp.getMartialStatus().equals("married"))
			{
				 femaleMarried.add(temp);
			}
		}
		return  femaleMarried;
	}

}
