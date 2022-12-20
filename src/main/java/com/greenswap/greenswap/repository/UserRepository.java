package com.greenswap.greenswap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenswap.greenswap.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
	//Vide --> c'est normal
}
