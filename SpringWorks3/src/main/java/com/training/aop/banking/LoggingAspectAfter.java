package com.training.aop.banking;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspectAfter {
	@After("execution(* get())")
	public void afterGetter()
	{
		System.out.println("*********Afetr advice invoked***********");
	}
	@AfterReturning("execution(* com.training.aop.model.SBAccount.getAcc())")
	public void afterSuccessfulGetter()
	{
		System.out.println("Afetr sucessful return====");
	}
	@AfterReturning(pointcut="args(val)",returning="returnString")
	public void afterReturningStringSetter(String val,String returnString) {
		System.out.println("Afetr invoked for Input-->"+val+",return->"+returnString);
	}
	
	@AfterThrowing("execution(* throw*())")
	public void afterException()
	{
		System.out.println("This is invoked for all exception::");
	}
}
