package com.training.observer;

public class Client {

	public static void main(String[] args) {
		IObservable observable=new OnePlus6T();
		
		IObserver user1=new User(observable, "kumar");
		IObserver user2=new User(observable, "Anuj");
		IObserver user3=new User(observable, "deepak");
		IObserver user4=new User(observable, "raj");
		
		observable.addUser(user1);
		observable.addUser(user2);

		observable.addUser(user3);

		observable.addUser(user4);
		
		((OnePlus6T)observable).setArrived(true);
		
		System.out.println("==================");
	
		
      IObservable observable1=new Apple();
		
		IObserver user11=new User(observable1, "kumar");
		IObserver user12=new User(observable1, "tejas");
		IObserver user13=new User(observable1, "deepak");
		IObserver user14=new User(observable1, "raju");
		
		observable1.addUser(user11);
		observable1.addUser(user12);

		observable1.addUser(user13);

		observable1.addUser(user14);
		
		((Apple)observable1).setArrived(true);


	}

}
