package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenswap.greenswap.model.Plants;


public interface PlantsRepository extends JpaRepository<Plants, Long> {
	//Vide --> c'est normal
}
