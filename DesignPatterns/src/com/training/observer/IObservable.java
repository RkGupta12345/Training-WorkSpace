package com.training.observer;

public interface IObservable {
	
	public void addUser(IObserver observer);
	public void remove(IObserver observer);
	
	//all those people who are in the list
	public void notifyObserver();

}
