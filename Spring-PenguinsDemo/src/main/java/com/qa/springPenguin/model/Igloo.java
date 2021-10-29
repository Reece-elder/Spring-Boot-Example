package com.qa.springPenguin.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Igloo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	
	private int capacity;
	
	@OneToMany(mappedBy = "igloo") // An "igloo" contains "penguins" Is the Foreign Key
	private List<Penguin> penguins; // Set = A collecton / List with no duplicate elements

	public Igloo() {
		super();
		// TODO Auto-generated constructor stub
	}

	// Constructor without penguins (not every igloo requires penguins but can contain Penguins)
	public Igloo(long id, String name, int capacity) {
		super();
		this.id = id;
		this.name = name;
		this.capacity = capacity;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Set<Penguin> getPenguins() {
		return penguins;
	}

	public void setPenguins(Set<Penguin> penguins) {
		this.penguins = penguins;
	}

	@Override
	public String toString() {
		return "Igloo [id=" + id + ", name=" + name + ", capacity=" + capacity + ", penguins=" + penguins + "]";
	}
	
	
}
