package com.qa.springPenguin.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.qa.springPenguin.model.Penguin;

@Service
public class Services {
	
	private ArrayList<Penguin> penguinList = new ArrayList<>();
	
	public Penguin getByIndex(int index) {
		return penguinList.get(index);
	}
	
	public Penguin createPenguin(Penguin penguin) {
		penguinList.add(penguin);
		System.out.println("Penguin added: " + penguin);
		
		return penguinList.get(penguinList.size() - 1);
	}
	
	public ArrayList<Penguin> getAllPenguins(){
		return penguinList;
	}
	
	public boolean deletePenguin(int id) {
		penguinList.remove(id);
		return true;
	}
	
	public Penguin updatePenguin(Penguin penguin, int id) {
		penguinList.set(id, penguin);
		return penguinList.get(id);
	}

}
