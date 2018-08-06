package com.training.singleton;

import java.io.Serializable;

// The singleton say there should be only one object
//to do so we will have the variable as static so that we can have only
//one reference ,in singleton we have two types
// Eager and Lazy Singleton
//(Cons for eager singleton) either the instance is needed or not always one copy will be kept in the JVM
public class Singleton implements Serializable{
	
	private static final Singleton instance=new Singleton();
	
	private Singleton() {
		System.out.println("Constructor is called");
	}
	
	public static Singleton getInstance()
	{
		return instance;
		
	}
	
	//to stop creating an instance if already exists
	//this is only for ObjectInputStream
	protected Object readResolve()
	{
		return getInstance();
		
	}

}
