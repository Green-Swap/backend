package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenswap.greenswap.model.Historics;


public interface HistoricsRepository extends JpaRepository<Historics, Long> {
	//Vide --> c'est normal
}
