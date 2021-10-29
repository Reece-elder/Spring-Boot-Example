package com.qa.springPenguin.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springPenguin.model.Penguin;
import com.qa.springPenguin.services.Services;

@RestController
public class ControllerDemo {
	
	private Services penguinService = new Services();
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello Everyone :p";
	}
	
	@PostMapping("/createPenguin")
		public ResponseEntity<String> createPenguin(@RequestBody Penguin penguin){
//			System.out.println(penguin);
//			PenguinList.add(penguin);
			penguinService.createPenguin(penguin);
			
			String stringResponse = "Penguin added!";
			
//			Penguin responseBody = PenguinList.get(PenguinList.size() - 1);
			
			ResponseEntity<String> response = new ResponseEntity<String>(stringResponse, HttpStatus.CREATED);
			return response;
			
	}
	
	
	@GetMapping("/get/{index}")
		public ResponseEntity<Penguin> getPenguin(@PathVariable("index") int index) {
		
			Penguin penguinResponse = penguinService.getByIndex(index);
			
			ResponseEntity<Penguin> response = new ResponseEntity<Penguin>(penguinResponse, HttpStatus.ACCEPTED);
			return response;
	}
	
	@GetMapping("/getAll")
	public ArrayList<Penguin> getAll() {
		return penguinService.getAllPenguins();
	}
	
	@DeleteMapping("/delete/{index}")
	public ResponseEntity<String> deletePenguin(@PathVariable("index") int index) {
		penguinService.deletePenguin(index);
		String responseString = "Penguin of index " + index + " has been deleted";
		System.out.println(responseString);
		ResponseEntity<String> response = new ResponseEntity<String>(responseString, HttpStatus.NO_CONTENT);
		return response;
	}
	
	@PutMapping("/update/{index}")
	public ResponseEntity<Penguin> updatePenguin(@RequestBody Penguin penguin, @PathVariable("index") int index) {
//		PenguinList.set(index, penguin);
//		
//		Penguin responseBody = PenguinList.get(PenguinList.size() - 1);
		
		Penguin responseBody = penguinService.updatePenguin(penguin, index);
		
		ResponseEntity<Penguin> response = new ResponseEntity<Penguin>(responseBody, HttpStatus.CREATED);
		return response;
		
	}

}
