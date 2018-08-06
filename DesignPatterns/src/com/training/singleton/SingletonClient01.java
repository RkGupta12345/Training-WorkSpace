package com.training.singleton;

public class SingletonClient01 {

	public static void main(String[] args) {
		Singleton singleton=Singleton.getInstance();
		
		System.out.println(singleton.hashCode());
		
		singleton=Singleton.getInstance();
		System.out.println(singleton.hashCode());
		
		singleton=Singleton.getInstance();
		System.out.println(singleton.hashCode());
	}

}
