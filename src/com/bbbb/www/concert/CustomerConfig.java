package com.bbbb.www.concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CustomerConfig {
	@Bean
	public ICustomer customerImpl(){
		return new CustomerImpl();
	}
}
