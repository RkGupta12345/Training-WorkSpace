package com.training.abstractfactory;

public interface IColor {
	void paintCar();

}
class Red implements IColor{

	@Override
	public void paintCar() {
		System.out.println("car painting color red");
	}
	
}

class Blue implements IColor{

	@Override
	public void paintCar() {
		System.out.println("car painting color blue");
		
	}
	
}