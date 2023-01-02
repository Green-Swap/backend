package com.greenswap.greenswap.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.greenswap.greenswap.model.User;


public interface UserRepository extends JpaRepository<User, Long> {
	@Query(value = "select * from user where user.firstname=firstname and user.lastName=lastName", nativeQuery=true)
	List<User> getUsersByNames(@Param("firstname") String firstname,@Param("lastName") String lastName);
	
	Optional<User> findUserByEmail(String email);
	
	@Query(value = "select * from user where user.city=city", nativeQuery=true)
	List<User>  getUsersByCity(@Param("city") String city);
	
	@Query(value = "select * from user where  user.email=email and user.password=password", nativeQuery=true)
	Optional<User> getUserByConnexion(@Param("email") String email, @Param("password") String password);
	
	@Query(value = "select * from user where  user.email=email and user.verified=verified", nativeQuery=true)
	Optional<User> getUserVerified(@Param("email") String email, @Param("verified") String verified);
	
	@Query(value = "select * from user where  user.email=email and user.isAdmin=true", nativeQuery=true)
	Optional<User> getAdmin(@Param("email") String email);
	
	@Query(value = "select * from user where  user.isAdmin=true", nativeQuery=true)
	List<User>  getAdmins();
	
	@Query(value = "select * from user where  user.isAdmin=false", nativeQuery=true)
	List<User>  getNonAdmins();
}
