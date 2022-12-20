package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenswap.greenswap.model.Connexion;


public interface ConnexionRepository extends JpaRepository<Connexion, Long> {
	//Vide --> c'est normal
}

