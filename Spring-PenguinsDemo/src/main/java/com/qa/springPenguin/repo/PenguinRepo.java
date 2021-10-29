package com.qa.springPenguin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.springPenguin.model.Penguin;

public interface PenguinRepo extends JpaRepository<Penguin, Long> {
	
	

}
