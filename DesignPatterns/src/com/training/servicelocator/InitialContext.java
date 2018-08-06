package com.training.servicelocator;

// this class can work for any service
public class InitialContext {
	
	public Object lookup(String jndiName)
	{
		if(jndiName.equalsIgnoreCase("db"))
		{
			System.out.println("loking for db service and creating");
			return new DBService();
		}else if (jndiName.equalsIgnoreCase("erp")) {
			System.out.println("loking for erp service and creating");
			return new ERPService();
		}
		return null;
	}
}
