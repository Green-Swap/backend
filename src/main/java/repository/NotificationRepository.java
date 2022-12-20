package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greenswap.greenswap.model.Notification;


public interface NotificationRepository extends JpaRepository<Notification, Long> {
	//Vide --> c'est normal
}
