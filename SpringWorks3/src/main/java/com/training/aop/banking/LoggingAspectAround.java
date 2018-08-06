package com.training.aop.banking;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspectAround {
	@Around("execution(public * get*())")
	public Object sampleMyAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		// the advice should have compulsary argument
		
		Object retVal=null;
		
		System.out.println("Before Job goes here...");
		try {
			retVal=proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Afetr Job goes here...");
		return retVal;
	}

}
