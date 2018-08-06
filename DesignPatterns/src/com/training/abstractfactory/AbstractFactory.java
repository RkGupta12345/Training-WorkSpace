package com.training.abstractfactory;

public abstract class AbstractFactory {
	//here we will have the listb of factories to be exposed
	
	public abstract IVehicle getVehicle(String vehicle);
	public abstract IColor getColor(String color);

}
