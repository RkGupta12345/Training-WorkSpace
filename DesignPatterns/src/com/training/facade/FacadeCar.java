package com.training.facade;

public class FacadeCar {
	private HatchBack hbc;
	private Sedan sedan;
	private SUV suv;
	
	public FacadeCar(HatchBack hbc, Sedan sedan, SUV suv) {
		this.hbc = hbc;
		this.sedan = sedan;
		this.suv = suv;
	}
	
	
	public FacadeCar() {
		this.hbc = new HatchBack();
		this.sedan = new Sedan();
		this.suv = new SUV();
		
	}


	public void hatchBackDriver() {
		hbc.drive();
	}
	
	public void sedanDrive() {
		sedan.drive();
	}
	
	public void suvDrive() {
		suv.drive();
	}
	
	

}
