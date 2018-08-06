package com.training.aop.banking;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	// this will scan for any package
	// this will scan for any class
	
	//@Before("execution(* com.training.aop.model.Account.get*())")
	//to specify the method exactly but this will find in any package
	//@Before("execution(* com.training.aop.model.*.get*())")
	//@Before("execution(public double com.training.aop.model.CAAccount.showBalance())")
	//@Before("execution(public * get*())")
	//@Before("execution( * get*())")
	//it will take one parameter
	//@Before("execution( * get*(*))")
	//log all the getters who either take the param or not
	//@Before("execution( * get*(..))")
	//any return type inany class of package com.training.aop.model
	@Before("execution(* com.training.aop.model.*.getBalance())")
	public void loogingAdviceBefore()
	{
		System.out.println("********Logging before Called**********");
	}
	@Before("allGetters()")
	public void secondAdvice()
	{
		System.out.println("Second aspect Invoked for all getters");
	}
	
	@Before("allGettersSBAccount()")
	public void secondAdviceForSBAccount() {
		System.out.println("Only for SB Account");
		
	}
	
	@Before("allGetters() || allGettersSBAccount()")
	public void compountAdvice() {
		System.out.println("This is compound advice for or" +"clause for getters and sb account");
	}
	@Pointcut("execution( * get*(..))")
	public void allGetters()
	{
		//System.out.println("this data should not be display");
	}
	
	@Pointcut("execution(* com.training.aop.model.SBAccount.getAcc())")
	public void allGettersSBAccount()
	{
		//System.out.println("this data should not be display");
	}

}
