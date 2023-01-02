package com.greenswap.greenswap.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenswap.greenswap.model.Type;


public interface TypeRepository extends JpaRepository<Type, Long> {
	Optional<Type> findTypeByName(String name);
}
