package com.training.profile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Profile("Development")
@Configuration
public class DevDatabaseConfig implements DatabaseConfig{
	@Bean
	public DataSource createDataSource() {
		DriverManagerDataSource dataSource1=new DriverManagerDataSource();
		System.out.println("Creating Development db Instance");
		return dataSource1;
	}

}
