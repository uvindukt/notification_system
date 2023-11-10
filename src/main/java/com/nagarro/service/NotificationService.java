package com.nagarro.service;

import com.nagarro.adapter.NotificationChannelAdapter;
import com.nagarro.constant.SystemConstant;
import com.nagarro.factory.NotificationChannelFactory;
import com.nagarro.model.Notification;
import com.nagarro.model.User;
import com.nagarro.observable.NotificationPublisher;
import com.nagarro.repository.UserRepository;
import com.nagarro.strategy.EmailStrategy;
import com.nagarro.strategy.NotificationStrategy;
import com.nagarro.strategy.SmsStrategy;

public class NotificationService {

    private final UserRepository userRepository;
    private final NotificationStrategy emailStrategy;
    private final NotificationStrategy smsStrategy;
    private final NotificationPublisher notificationPublisher;

    public NotificationService(UserRepository userRepository) {
        this.userRepository = userRepository;
        emailStrategy = new EmailStrategy();
        smsStrategy = new SmsStrategy();
        notificationPublisher = new NotificationPublisher();
        subscribeUsersToNotifications();
    }

    private void subscribeUsersToNotifications() {

        for (User user : userRepository.getAllUsers()) {
            if (user.getNotificationSubscriptionStatus()) {
                notificationPublisher.addObserver(user);
            }
        }

    }

    public void sendNotification(String channel, String subject, String body) {

        NotificationChannelFactory notificationChannelFactory = NotificationChannelFactory.getInstance();
        NotificationChannelAdapter notificationChannel = notificationChannelFactory.getNotificationChannel(channel);

        if (channel.equalsIgnoreCase(SystemConstant.EMAIL)) {

            notificationPublisher.sendNotification(new Notification(subject, body, emailStrategy), notificationChannel);

        } else if (channel.equalsIgnoreCase(SystemConstant.SMS)) {

            notificationPublisher.sendNotification(new Notification(subject, body, smsStrategy), notificationChannel);

        } else {

            System.out.println("Invalid Notification Channel");

        }

    }

}
