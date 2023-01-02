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

import com.greenswap.greenswap.model.User;
import com.greenswap.greenswap.repository.UserRepository;

@RestController
@RequestMapping("/greenswap")
public class UserController {
	// Instanciation du code JPA pour récupérer les données dans la BDD
	@Autowired
	UserRepository userRepository;

	// Get all users
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	// Create a user
	@PostMapping("/user")
	public User createUser(@Valid @RequestBody User user) {
		return userRepository.save(user);
	}

	// Get a Single user by id
	@GetMapping("/user/{id}")
	public ResponseEntity<?> getUserById(@PathVariable(value = "id") Long userId) {
		Optional<User> user = userRepository.findById(userId);
		return new ResponseEntity<>(user, HttpStatus.FOUND);
	}

	// Get a Single user by name
	@GetMapping("/user/{firstname}/{lastname}")
	public ResponseEntity<?> getUserByName(@PathVariable(value = "firstname") String firstname, @PathVariable(value = "lastname") String lastname) {
		List<User> user = userRepository.getUsersByNames(firstname,lastname);
		return new ResponseEntity<>(user, HttpStatus.FOUND);
	}

	// Delete a user by id
	@DeleteMapping("/user/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Long userId) throws Exception {
		userRepository.deleteById(userId);
		return ResponseEntity.ok().build();
	}

	// Update user firstname
	@PutMapping("/user/{id}")
	public ResponseEntity<?> udpateUserFirstname (@PathVariable(value = "id") Long userId, @Valid @RequestBody String firstname)
			throws Exception {
		User user = userRepository.findById(userId).get();
		if (firstname != null) {
			user.setFirstname(firstname);
		}

		User _user = userRepository.save(user);
		return new ResponseEntity<>(_user, HttpStatus.OK);
	}
	
	// Update user lastname
	@PutMapping("/user/{id}")
	public ResponseEntity<?> udpateUserLastame(@PathVariable(value = "id") Long userId, @Valid @RequestBody String lastname)
			throws Exception {
		User user = userRepository.findById(userId).get();
		if (lastname != null) {
			user.setLastName(lastname);
		}

		User _user = userRepository.save(user);
		return new ResponseEntity<>(_user, HttpStatus.OK);
	}


}