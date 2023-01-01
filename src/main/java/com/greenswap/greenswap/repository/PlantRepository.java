package com.greenswap.greenswap.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenswap.greenswap.model.Plant;

public interface PlantRepository extends JpaRepository<Plant, Long> {
	Optional<Plant> findPlantByName(String name);
}
