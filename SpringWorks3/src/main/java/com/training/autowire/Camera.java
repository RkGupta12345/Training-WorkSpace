package com.training.autowire;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Camera {
	@Value("${type1}")
	private String type;

	public Camera() {
		//System.out.println("Creating camera"+this);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
