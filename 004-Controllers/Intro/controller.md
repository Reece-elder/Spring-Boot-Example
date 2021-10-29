package com.qa.springPenguin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello Everyone :p";
	}

}
