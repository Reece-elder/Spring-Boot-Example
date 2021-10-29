package com.qa.springPenguin.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.springPenguin.model.Igloo;

public interface IglooRepo extends JpaRepository<Igloo, Long>{

}
