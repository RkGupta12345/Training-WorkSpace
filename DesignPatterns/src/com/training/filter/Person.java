package com.training.filter;

public class Person {
	private String name;
	private String sex;
	private String martialStatus;

	public Person() {
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getSex() {
		return sex;
	}

	protected void setSex(String sex) {
		this.sex = sex;
	}

	protected String getMartialStatus() {
		return martialStatus;
	}

	protected void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}

	public Person(String name, String sex, String martialStatus) {
		super();
		this.name = name;
		this.sex = sex;
		this.martialStatus = martialStatus;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", sex=" + sex + ", martialStatus=" + martialStatus + "]";
	}

}
