package com.qa.springPenguin.services;

import java.util.ArrayList;

import com.qa.springPenguin.model.Penguin;

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

}
