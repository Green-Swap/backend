package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenswap.greenswap.model.Type;


public interface TypeRepository extends JpaRepository<Type, Long> {
	//Vide --> c'est normal
}
