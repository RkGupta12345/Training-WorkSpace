package com.training.strategy;

public class CreditCard implements Payment{
	
	private String name;
	private String cardNumber;
	private String cvv;
	private String dateOfExpiry;
	private double discount;
	private String bankName;
	
	

	public CreditCard(String name, String cardNumber, String cvv, String dateOfExpiry, double discount,
			String bankName) {
		super();
		this.name = name;
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
		this.discount = discount;
		this.bankName = bankName;
	}



	@Override
	public String toString() {
		return "CreditCard [name=" + name + ", cardNumber=" + cardNumber + ", cvv=" + cvv + ", dateOfExpiry="
				+ dateOfExpiry + ", discount=" + discount + ", bankName=" + bankName + "]";
	}



	@Override
	public void pay(int amount) {
		if(this.bankName.equalsIgnoreCase("hdfc")) {
			amount=(int) (amount-(amount*0.1));
			System.out.println("Paying with Hdfc and got discount of 10%,paid--"+amount);
		}else {
			System.out.println("paying amount of"+amount+"with credit card"+bankName);
		}
	}

}
