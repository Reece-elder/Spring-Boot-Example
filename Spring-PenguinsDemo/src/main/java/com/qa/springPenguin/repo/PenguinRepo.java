package com.qa.springPenguin.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.springPenguin.model.Penguin;

public interface PenguinRepo extends JpaRepository<Penguin, Long> {
	
	List<Penguin> findByName(String name);
	// Auto generates SELECT * FROM penguin WHERE name = ?
	
	List<Penguin> findByAge(int age);
	// Auto generates SELECT * FROM penguin WHERE age = ?
	
	List<Penguin> findByAgeLessThan(int age); 
	// Auto generates SELECT * FROM penguin WHERE age <= ?

}
