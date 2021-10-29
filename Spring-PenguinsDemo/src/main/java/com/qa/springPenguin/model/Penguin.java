package com.qa.springPenguin.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	
	public Penguin(String name, int age, boolean happyFeet) {
		super();
		this.name = name;
		this.age = age;
		this.happyFeet = happyFeet;
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
