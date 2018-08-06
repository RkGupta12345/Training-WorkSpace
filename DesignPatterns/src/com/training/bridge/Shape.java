package com.training.bridge;

//
//every shape shall have color
public abstract class Shape {
	private IColor color;

	public Shape(IColor color) {
		this.color = color;
	}
	
	
	
	protected IColor getColor() {
		return color;
	}



	protected void setColor(IColor color) {
		this.color = color;
	}



	public abstract void applyColor();
	
	

}
