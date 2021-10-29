package com.qa.springPenguin;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringPenguinsDemoApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(SpringPenguinsDemoApplication.class, args);
		
		Object objectName = context.getBean("helloWorld");
		String byType = context.getBean(String.class);
		String both = context.getBean("helloWorld", String.class);
		
		System.out.println(objectName);
		System.out.println(byType);
		System.out.println(both);
	}


}
