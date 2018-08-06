package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class MaleMarried implements ICriteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> maleMarried=new ArrayList<Person>();
		for(Person temp:persons) {
			if(temp.getSex().equals("male") && temp.getMartialStatus().equals("married"))
			{
				 maleMarried.add(temp);
			}
		}
		return  maleMarried;
	}

}
