package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenswap.greenswap.model.Favorites;


public interface FavoritesRepository extends JpaRepository<Favorites, Long> {
	//Vide --> c'est normal
}
