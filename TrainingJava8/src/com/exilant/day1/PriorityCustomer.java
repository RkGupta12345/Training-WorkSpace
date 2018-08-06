package com.exilant.day1;

public class PriorityCustomer {

	private int customerId;
	private String customerName;
	private String customerType;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerType() {
		return customerType;
	}
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	@Override
	public String toString() {
		return "PriorityCustomer [customerId=" + customerId + ", customerName=" + customerName + ", customerType="
				+ customerType + "]";
	}
	public PriorityCustomer(int customerId, String customerName, String customerType) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerType = customerType;
	}
	public PriorityCustomer() {
		super();
	}
	public PriorityCustomer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	

}
