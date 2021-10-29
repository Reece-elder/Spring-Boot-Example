package com.qa.springPenguin;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public String helloWorld() {
		return "Hello World!";
		
	}

}

IMPORTANT TO CREATE A CLASS of whatever name WITH @CONFIGURATION annotation
