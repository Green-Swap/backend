package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenswap.greenswap.model.Plant;


public interface PlantRepository extends JpaRepository<Plant, Long> {
	//Vide --> c'est normal
}
