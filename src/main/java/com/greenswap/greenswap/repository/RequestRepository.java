package com.greenswap.greenswap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenswap.greenswap.model.Request;


public interface RequestRepository extends JpaRepository<Request, Long> {
	//Vide --> c'est normal
}

