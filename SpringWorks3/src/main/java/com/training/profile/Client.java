package com.training.profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.AbstractEnvironment;

public class Client {

	public static void main(String[] args) {
		 //System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "Development,Production");
		 // ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
			
		ApplicationContext context=new AnnotationConfigApplicationContext();
		((AnnotationConfigApplicationContext)context).getEnvironment().setActiveProfiles("Development","Production");
		
		// scans the mentioned packages and register all the components available in the spring
		
		((AnnotationConfigApplicationContext)context).scan("com.training.profile");
		((AnnotationConfigApplicationContext)context).refresh();
		((AnnotationConfigApplicationContext)context).close();
	}

}
