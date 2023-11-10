package com.nagarro.facade;

import com.nagarro.repository.UserRepository;
import com.nagarro.service.NotificationService;

public class NotificationServiceFacade {

    private final NotificationService notificationService;

    public NotificationServiceFacade(UserRepository userRepository) {
        this.notificationService = new NotificationService(userRepository);
    }

    public void sendNotification(String channel, String subject, String body) {
        notificationService.sendNotification(channel, subject, body);
    }

}
