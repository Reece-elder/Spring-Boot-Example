package com.qa.springPenguin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Penguin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto increments
	private long id;
	
	@Column(unique = true, nullable = false)
	private String name;
	
	@Column(unique = false, nullable = false)
	private int age;
	
	@Column(unique = false, nullable = false)
	private boolean happyFeet;
	
	@ManyToOne // Many to One relationship
	private Igloo igloo; // Penguin belongs to some igloo
	
	public Penguin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Penguin(String name, int age, boolean happyFeet) {
		super();
		this.name = name;
		this.age = age;
		this.happyFeet = happyFeet;
	}

	public Penguin(long id, String name, int age, boolean happyFeet) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.happyFeet = happyFeet;
	}

	// Adding igloo getters and setters
	public Igloo getIgloo() {
		return igloo;
	}

	public void setIgloo(Igloo igloo) {
		this.igloo = igloo;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isHappyFeet() {
		return happyFeet;
	}

	public void setHappyFeet(boolean happyFeet) {
		this.happyFeet = happyFeet;
	}

	@Override
	public String toString() {
		return "Penguin [name=" + name + ", age=" + age + ", happyFeet=" + happyFeet + "]";
	}
	
	
	
	

}
