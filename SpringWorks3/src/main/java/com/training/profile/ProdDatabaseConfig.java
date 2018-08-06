package com.training.profile;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
@Configuration
@Profile("Production")
public class ProdDatabaseConfig implements DatabaseConfig{
	@Bean
	public DataSource createDataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		System.out.println("Creating Production db Instance");
		return dataSource;
	}

}
