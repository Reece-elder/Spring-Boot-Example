package com.qa.springPenguin.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springPenguin.model.Igloo;
import com.qa.springPenguin.services.IglooService;

@RestController
public class IglooController {
	
	private IglooService service;
	
	public IglooController(IglooService service) {
		super();
		this.service = service;
	}



	@PostMapping("/create/igloo")
	public ResponseEntity<Igloo> createIgloo(@RequestBody Igloo igloo){
		Igloo responseIgloo = service.createIgloo(igloo);
		
		ResponseEntity<Igloo> response = new ResponseEntity<Igloo>(responseIgloo, HttpStatus.CREATED);
		return response;
	}
	
	@GetMapping("/getAll/igloo")
	public List<Igloo> getAllIgloo(){
		return service.getAllIgloos();
	}

}
