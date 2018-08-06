package com.training.strategy;

public class EWallet implements Payment {

	private String email;
	private String password;
	private String walletName;

	public EWallet(String email, String password, String walletName) {
		super();
		this.email = email;
		this.password = password;
		this.walletName = walletName;
	}

	@Override
	public String toString() {
		return "EWallet [email=" + email + ", password=" + password + ", walletName=" + walletName + "]";
	}

	@Override
	public void pay(int amount) {
		if (walletName.equalsIgnoreCase("paytm")) {
			amount = (int) (amount - (amount * 0.1));
			System.out.println("You are paying through PAYTM, and paid--" + amount);
		} else {
			System.out.println("paying amount of-->" + amount + "with credit card->" + walletName);
		}

	}

}
