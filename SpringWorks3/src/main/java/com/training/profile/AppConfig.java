package com.training.profile;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages="com.training.profile")
@Configuration
public class AppConfig {
	@Autowired
	 
	public DataSource dataSource;

}
