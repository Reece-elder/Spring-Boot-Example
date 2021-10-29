package com.qa.springPenguin.model;

public class Penguin {
	
	private String name;
	private int age;
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
