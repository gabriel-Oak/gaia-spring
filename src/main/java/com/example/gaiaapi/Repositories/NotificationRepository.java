package com.example.gaiaapi.Repositories;

import com.example.gaiaapi.Dto.NotificationDto;
import com.example.gaiaapi.Models.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

    List<Notification> findByUserId(Long user_id);
}
