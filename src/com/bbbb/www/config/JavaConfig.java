package com.bbbb.www.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JavaConfig {
	@Bean
	public IDBean dBeanImpl(){
		return new DBeanImpl();
	}
}
