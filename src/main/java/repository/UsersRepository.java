package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenswap.greenswap.model.Users;


public interface UsersRepository extends JpaRepository<Users, Long> {
	//Vide --> c'est normal
}
