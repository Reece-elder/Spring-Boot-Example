package com.qa.springPenguin.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.qa.springPenguin.model.Penguin;
import com.qa.springPenguin.repo.PenguinRepo;


@Service
@Primary // If multiple beans of a type exist (service etc.) Primary indicates use this bean
public class ServicesDB {
	
	private PenguinRepo repo;

	// Spring creates objects of all beans, by specifying the constructor here with a repo, it will assign it this repo
	public ServicesDB(PenguinRepo repo) {
		super();
		this.repo = repo;
	}
	
	// Use List rather than arrayList
	public List<Penguin> getAllPenguins(){
		// SELECT * FROM penguin
		return repo.findAll();
	}
	
	public Penguin createPenguin(Penguin penguin) {
		System.out.println("Penguin added through DB");
		return repo.save(penguin);
	}
	
	

}
