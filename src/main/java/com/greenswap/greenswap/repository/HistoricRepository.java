package com.greenswap.greenswap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenswap.greenswap.model.Historic;


public interface HistoricRepository extends JpaRepository<Historic, Long> {
	//Vide --> c'est normal
}
