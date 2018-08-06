package com.training.observer;

public class User implements IObserver{
	
	private IObservable observable=null;
	private String name;
	
	
// the constructor is a mapper between	
//
	public User(IObservable observable, String name) {
		this.observable = observable;
		this.name = name;
	}

	public void buyMobile(String item) {
		System.out.println("Hurry, I have bought"+item+" by"+name);
	}


	@Override
	public void update(String item) {
		buyMobile(item);
		
	}
	public void unSubscribe() {
		observable.remove(this);
	}

}
