package com.training.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		//ApplicationContext context=new ClassPathXmlApplicationContext("spring-context3.xml");
		//ApplicationContext context=new ClassPathXmlApplicationContext("speaker-context.xml","camera-context.xml","screen-context.xml","mobile-context.xml");
		ApplicationContext context=new ClassPathXmlApplicationContext("mobile-context.xml");
		Mobile mobile=context.getBean("mobile",Mobile.class);
		System.out.println("Mobile Details:::::");
		
		System.out.println("Mobile Type:"+mobile.getCamera().getType());
		System.out.println("Speaker details::"+mobile.getSpeaker().getType()+","+mobile.getSpeaker().getVolLevels());
		
		System.out.println("Screen details::"+mobile.getScreen().getGlassType()+","+mobile.getScreen().getBre()+","+mobile.getScreen().getLen());
	}

}
