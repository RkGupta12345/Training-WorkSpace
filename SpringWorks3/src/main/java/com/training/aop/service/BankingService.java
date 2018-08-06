package com.training.aop.service;

import com.training.aop.model.CAAccount;
import com.training.aop.model.SBAccount;

public class BankingService {
	private SBAccount sbAccount;
	private CAAccount caAccount;

	public SBAccount getSbAccount() {
		System.out.println("In SBI Account");
		return sbAccount;
	}

	public void setSbAccount(SBAccount sbAccount) {
		this.sbAccount = sbAccount;
	}

	public CAAccount getCaAccount() {
		return caAccount;
	}

	public void setCaAccount(CAAccount caAccount) {
		this.caAccount = caAccount;
	}

	@Override
	public String toString() {
		return "BankingService [sbAccount=" + sbAccount + ", caAccount=" + caAccount + "]";
	}
	
	public String setAndGet(String name) {
		return "Hello Mr/Mrs=>"+name;
	}
	
	public void throwSomeException()
	{
		int a=1;
		if(a==1) {
			throw new RuntimeException("User threw exception");
		}
		System.out.println("user is okay with the value");
	}

}
