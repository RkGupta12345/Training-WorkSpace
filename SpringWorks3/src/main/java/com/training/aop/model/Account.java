package com.training.aop.model;

public class Account {
	private int accountNo;
	private String accName;
	private double balance;

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [accountNo=" + accountNo + ", accName=" + accName + ", balance=" + balance + "]";
	}

}
