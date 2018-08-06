package com.training.abstractfactory;

public class Client {

	public static void main(String[] args) {
		
		
		
		IColor redColor=FactoryProducer.getFactory("color").getColor("red");
		IColor blueColor=FactoryProducer.getFactory("color").getColor("blue");
		redColor.paintCar();
		
		AbstractFactory vehicleFactory=FactoryProducer.getFactory("vehicle");
		
		IVehicle fordCar=vehicleFactory.getVehicle("car");
		fordCar.move();
		fordCar.speed(300);
		fordCar.paint(redColor);
		
		IVehicle manTruck=vehicleFactory.getVehicle("truck");
		manTruck.move();
		manTruck.speed(120);
		fordCar.paint(blueColor);
		

	}

}
