package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenswap.greenswap.model.Notifications;


public interface NotificationsRepository extends JpaRepository<Notifications, Long> {
	//Vide --> c'est normal
}
