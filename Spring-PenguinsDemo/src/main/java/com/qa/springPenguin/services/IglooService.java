package com.qa.springPenguin.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.qa.springPenguin.model.Igloo;
import com.qa.springPenguin.repo.IglooRepo;

@Service
public class IglooService {
	
	private IglooRepo repo;

	public IglooService(IglooRepo repo) {
		super();
		this.repo = repo;
	}
	
	public List<Igloo> getAllIgloos(){
		return repo.findAll();
	}
	
	public Igloo createIgloo(Igloo igloo) {
		return repo.save(igloo);
	}

}
