package com.training.filter;

import java.util.ArrayList;
import java.util.List;

public class Female implements ICriteria{

	@Override
	public List<Person> meetCriteria(List<Person> persons) {
		List<Person> female=new ArrayList<Person>();
		for(Person temp:persons) {
			if(temp.getSex().equals("female"))
			{
				female.add(temp);
			}
		}
		return female;
	}

}
