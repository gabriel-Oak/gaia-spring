package com.example.gaiaapi.Controllers;

import com.example.gaiaapi.Dto.NotificationDto;
import com.example.gaiaapi.Models.Notification;
import com.example.gaiaapi.Repositories.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notification")
public class NotificationController {
    @Autowired
    NotificationRepository notificationRepository;

    @GetMapping
    List<NotificationDto> list(Long user_id) {
        List<Notification> notifications = notificationRepository.findByUserId(user_id);
        return  NotificationDto.convert(notifications);
    }

    @PutMapping
    void read(Long user_id) {
        List<Notification> notifications = notificationRepository.findByUserId(user_id);
        notifications.forEach(notification -> {
            notification.setState("READ");
            notificationRepository.save(notification);
        });
        return;
    }
}
