package com.exilant.day2;

//all business logic 
public class Runner {
	public void execute(WorkerInterface workerInterface)
	{
		System.out.println("In execute method");
		workerInterface.doSomeWork();
	}

}
