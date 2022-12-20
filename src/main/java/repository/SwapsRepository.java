package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenswap.greenswap.model.Swaps;


public interface SwapsRepository extends JpaRepository<Swaps, Long> {
	//Vide --> c'est normal
}
