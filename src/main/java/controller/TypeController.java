package controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greenswap.greenswap.model.Type;

import repository.TypeRepository;

@RestController
@RequestMapping("/grenswap")
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
	public Type createType(@Valid @RequestBody Type article) {
		return typeRepository.save(article);
	}
}
