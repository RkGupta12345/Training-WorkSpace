package com.training.strategy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {

	public static void main(String[] args) {
		
		Item item1=new Item("A-101", 101, 2);
		Item item2=new Item("A-101", 101, 2);
		Item item3=new Item("A-101", 101, 2);
		
		ShoppingCart shoppingCart=new ShoppingCart();
		
		shoppingCart.addItem(item1);
		shoppingCart.addItem(item2);
		shoppingCart.addItem(item3);
		
		System.out.println("Total Amount::"+shoppingCart.calculateTotal());
		Payment paymentStrategy=new EWallet("rk@gmail.com", "12345", "freecharge");
		shoppingCart.checkOut(paymentStrategy);
		
		
		List<Item> items=Stream.of(
				new Item("A-101", 101, 2),
				new Item("2334", 101, 2),
				new Item("A-101", 101, 5)
				).collect(Collectors.toList());
		
		shoppingCart.addItems(items);
		
		System.out.println("Total Amount::"+shoppingCart.calculateTotal());
		Payment paymentStrategy1=new EWallet("rk233455@gmail.com", "12345", "freecharge");
		shoppingCart.checkOut(paymentStrategy1);
		
		

	}

}
