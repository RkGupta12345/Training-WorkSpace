package com.training.basic;

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

	@Override
	public String sayHello() {

		return sayHello(name, city);
	}

	// this value is given by configuration
	@Override
	public String sayHello(String name, String city) {
		String myStrs[] = { "hey how are you Mr/Ms/Mrs %s & How is your city %s", "Good Morning %s , are you in %s",
				"Mr/Ms/Mrs %s, your city is beautiful %s " };

		int randomNumber = (int) (Math.random() * 3);
		return String.format(myStrs[randomNumber], name, city);

	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getCity() {
		return city;
	}

	protected void setCity(String city) {
		this.city = city;
	}

}
