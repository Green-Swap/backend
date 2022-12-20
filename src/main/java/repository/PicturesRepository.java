package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenswap.greenswap.model.Pictures;


public interface PicturesRepository extends JpaRepository<Pictures, Long> {
	//Vide --> c'est normal
}
