package com.example.gaiaapi.Dto;

import com.example.gaiaapi.Models.Notification;
import com.example.gaiaapi.Models.User;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class NotificationDto {
    private Long id;
    private Long user_id;
    private String message;
    private String state;
    private LocalDateTime createdAt;

    public NotificationDto(Notification notification) {
        this.id = notification.getId();
        this.user_id = notification.getUser().getId();
        this.message = notification.getMessage();
        this.state = notification.getState();
        this.createdAt = notification.getCreatedAt();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public static List<NotificationDto> convert(List<Notification> notifications) {
        return notifications.stream().map(NotificationDto::new).collect(Collectors.toList());
    }
}
