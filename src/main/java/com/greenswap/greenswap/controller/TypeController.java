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
import com.greenswap.greenswap.model.Type;
import com.greenswap.greenswap.repository.TypeRepository;

@RestController
@RequestMapping("/greenswap")
public class TypeController {
	// Instanciation du code JPA pour récupérer les données dans la BDD
	@Autowired
	TypeRepository typeRepository;

	// Get all types
	@GetMapping("/types")
	public List<Type> getAllTypes() {
		return typeRepository.findAll();
	}

	// Create a type
	@PostMapping("/type")
	public Type createType(@Valid @RequestBody Type type) {
		return typeRepository.save(type);
	}

	// Get a Single Article by id
	@GetMapping("/type/{id}")
	public Type getTypeById(@PathVariable(value = "id") Long typeId) {
		Optional<Type> type = typeRepository.findById(typeId);
		return type.get();
	}

	// Get a Single Article by name
	@GetMapping("/type/name/{name}")
	public Type getTypeByName(@PathVariable(value = "name") String typeName) {
		Optional<Type> type = typeRepository.findTypeByName(typeName);
		return type.get();
	}

	// Delete a type by id
	@DeleteMapping("/type/{id}")
	public ResponseEntity<?> deleteType(@PathVariable(value = "id") Long typeId) throws Exception {
		typeRepository.deleteById(typeId);
		return ResponseEntity.ok().build();
	}

	// Add plant by type id
	@PutMapping("/type/{id}/plant")
	public ResponseEntity<?> addPlantToTypeById(@PathVariable("id") long id, @RequestBody Plant plant) {
		Optional<Type> type = typeRepository.findById(id);
		if (type.isEmpty()) {
			throw new ResourceNotFoundException("type", "id", id);
		}
		Type _type = type.get();
		_type.addPlant(plant);
		typeRepository.save(_type);

		return new ResponseEntity<>(plant, HttpStatus.CREATED);
	}

	// Update type name
	@PutMapping("/type/{id}")
	public Type udpateTypeName(@PathVariable(value = "id") Long typeId, @Valid @RequestBody String name) throws Exception {
		Type type = typeRepository.findById(typeId).get();
		if (name != null) {
			type.setName(name);
		}

		Type _type = typeRepository.save(type);
		return _type;
	}
}
