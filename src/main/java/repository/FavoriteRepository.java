package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenswap.greenswap.model.Favorite;


public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
	//Vide --> c'est normal
}
