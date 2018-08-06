package com.training.aop.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.aop.model.CAAccount;
import com.training.aop.model.SBAccount;
import com.training.aop.service.BankingService;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("aop-context.xml");
		BankingService bankingService =(BankingService) context.getBean("banking");
		System.out.println(bankingService.getSbAccount().getAcc().getBalance());
		System.out.println(bankingService.getSbAccount().getAcc().getAccName());
		System.out.println(bankingService.getSbAccount().getAcc().getAccountNo());
		
		
		System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&");
		
		System.out.println(bankingService.getCaAccount().getAccount().getBalance());
		System.out.println("AOP CALLING");
		System.out.println(bankingService.getCaAccount().showBalance());
		System.out.println("====================");
		SBAccount sbAccount =bankingService.getSbAccount();
		System.out.println(sbAccount);
		System.out.println("====================");
		CAAccount caAccount=bankingService.getCaAccount();
		System.out.println(caAccount);
		
		bankingService.getCaAccount().getOneParameter(20000);
		
		String retVal=bankingService.setAndGet("Harry");
		System.out.println("In Main method="+retVal);
		
		//bankingService.throwSomeException();
		
	}

}
