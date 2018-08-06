package com.training.bridge;

public class Pentagon extends Shape{

	public Pentagon(IColor color) {
		super(color);
	}

	@Override
	public void applyColor() {
		System.out.println("pentagon is applying color");
		getColor().applyColor();
	}

}
