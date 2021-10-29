package com.qa.springPenguin.demofiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration

public class Hello {
	
	@Bean
	public String helloWorld() {
		return "Hello World!";
		
	}

	


}
