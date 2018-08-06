package com.training.messagesource;

import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("message-resource-context.xml");
		// HelloWorld helloWorld=context.getBean("helloWorld",HelloWorld.class);
		String engGoodMorning = context.getMessage("goodmorning", new Object[] {}, null);
		String freGoodMorning = context.getMessage("helloworld.greet", new Object[] {}, new Locale("FR"));
		String japanGoodMorning = context.getMessage("helloworld.greet", new Object[] {}, new Locale("JAPAN"));
		System.out.println(engGoodMorning);
		System.out.println(freGoodMorning);
		System.out.println(japanGoodMorning);

		System.out.println("============================");

		HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);
		helloWorld.sayHelloWorld();
		helloWorld.sayHelloWorld_fr();
		helloWorld.sayHelloWorld_japan();
	}

}
