package com.training.basic;

import java.util.Random;

public class DefaultHello implements HelloService {

	private String name;
	private String city;

	public DefaultHello() {

	}

	public DefaultHello(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public String sayHello() {

		return sayHello(name, city);
	}

	// this value is given by configuration
	public String sayHello(String name, String city) {
		String myStrs[] = { "hey how are you Mr/Ms/Mrs %s & How is your city %s", "Good Morning %s , are you in %s",
				"Mr/Ms/Mrs %s, your city is beautiful %s " };
		Random random=new Random();
		int msg=random.nextInt(myStrs.length);
		System.out.println(msg);

		//int randomNumber = (int) (Math.random() * 3);
		return String.format(myStrs[msg], name, city);

	}
	
	public void ginit()
	{
		System.out.println(" global init in default Hello");
	}
	
	public void gdestroy()
	{
		System.out.println(" global destroy in default Hello");
	}

	public  String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
