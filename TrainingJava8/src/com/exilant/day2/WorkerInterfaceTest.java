package com.exilant.day2;

public class WorkerInterfaceTest {

	public static void main(String[] args) {
		Runner runner=new Runner();
		runner.execute(new WorkerInterface() {
			
			@Override
			public void doSomeWork() {
				System.out.println("Hi we are doing some work in main :::");
			}
		});
		
		System.out.println("------------------");
		
		runner.execute(()->System.out.println("Him i m in lambda way in main"));
		System.out.println("------------------");
		
		runner.execute(()->{
			System.out.println("In lambda way ,i multiple lines");
			System.out.println("we can have business logic here");
		});
	}

}
