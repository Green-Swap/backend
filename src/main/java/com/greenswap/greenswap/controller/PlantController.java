package com.greenswap.greenswap.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenswap.greenswap.exception.ResourceNotFoundException;
import com.greenswap.greenswap.model.Plant;
import com.greenswap.greenswap.model.User;
import com.greenswap.greenswap.repository.PlantRepository;
import com.greenswap.greenswap.repository.UserRepository;


@RestController
@RequestMapping("/greenswap")
public class PlantController {
	// Instanciation du code JPA pour récupérer les données dans la BDD
	@Autowired
	PlantRepository plantRepository;
	
	@Autowired
	UserRepository userRepository;

	// Get all plants
	@GetMapping("/plants")
	public List<Plant> getAllPlants() {
		return plantRepository.findAll();
	}

	// Create a plant
	@PostMapping("/plant")
	public Plant createPlant(@Valid @RequestBody Plant plant) {
		return plantRepository.save(plant);
	}

	// Get a Single plant by id
	@GetMapping("/plant/{id}")
	public Plant getPlantById(@PathVariable(value = "id") Long plantId) {
		Optional<Plant> plant = plantRepository.findById(plantId);
		return plant.get();
	}

	// Get a Single plant by name
	@GetMapping("/plant/name/{name}")
	public Plant getPlantByName(@PathVariable(value = "name") String plantName) {
		Optional<Plant> plant = plantRepository.findPlantByName(plantName);
		return plant.get();
	}

	// Delete a plant by id
	@DeleteMapping("/plant/{id}")
	public ResponseEntity<?> deletePlant(@PathVariable(value = "id") Long plantId) throws Exception {
		plantRepository.deleteById(plantId);
		return ResponseEntity.ok().build();
	}

	// Add user to plant by id
	@PutMapping("/plant/{id}/user/{userId}")
	public ResponseEntity<?> addUserToPlant(@PathVariable("id") long id, @PathVariable("userId") long userId) {
		Optional<Plant> plant = plantRepository.findById(id);
		if (plant.isEmpty()) {
			throw new ResourceNotFoundException("plant", "id", id);
		}
		Plant _plant = plant.get();
		Optional<User> user = userRepository.findById(userId);
		if(_plant.getUser()!=null && !user.isEmpty()) {
			_plant.setUser(user.get());
			plantRepository.save(_plant);
			return new ResponseEntity<>(_plant, HttpStatus.CREATED);
		}
		return ResponseEntity.notFound().build();
	}

	// Update plant name
	@PutMapping("/plant/{id}")
	public ResponseEntity<?> udpatePlantName (@PathVariable(value = "id") Long plantId, @Valid @RequestBody String name) throws Exception {
		Plant plant = plantRepository.findById(plantId).get();
		if (name != null) {
			plant.setName(name);
		}

		Plant _plant = plantRepository.save(plant);
		return new ResponseEntity<>(_plant, HttpStatus.CREATED);
	}
}