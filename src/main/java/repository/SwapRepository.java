package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenswap.greenswap.model.Swap;


public interface SwapRepository extends JpaRepository<Swap, Long> {
	//Vide --> c'est normal
}
