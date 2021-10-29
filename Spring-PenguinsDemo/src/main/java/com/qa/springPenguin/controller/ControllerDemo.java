package com.qa.springPenguin.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.springPenguin.model.Penguin;

@RestController
public class ControllerDemo {
	
	public ArrayList<Penguin> PenguinList = new ArrayList<>();
	
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello Everyone :p";
	}
	
	@PostMapping("/createPenguin")
		public String createPenguin(@RequestBody Penguin penguin){
			System.out.println(penguin);
			PenguinList.add(penguin);
			return penguin.toString();
			
	}
	
	
	@GetMapping("/get/{index}")
		public String getPenguin(@PathVariable("index") int index) {
			Penguin penguin = PenguinList.get(index);
			return penguin.toString();
	}
	
	@GetMapping("/getAll")
	public String getAll() {
		return PenguinList.toString();
	}
	
	@DeleteMapping("/delete/{index}")
	public boolean deletePenguin(@PathVariable("index") int index) {
		PenguinList.remove(index);
		System.out.println("Penguin of index " + index + " has been deleted");
		return true;
		
	}
	
	@PutMapping("/update/{index}")
	public String updatePenguin(@RequestBody Penguin penguin, @PathVariable("index") int index) {
		PenguinList.set(index, penguin);
		return penguin.toString();
	}

}
