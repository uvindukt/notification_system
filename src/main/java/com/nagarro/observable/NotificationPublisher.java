package com.nagarro.observable;

import com.nagarro.adapter.NotificationChannelAdapter;
import com.nagarro.model.Notification;
import com.nagarro.model.User;

import java.util.ArrayList;
import java.util.List;

public class NotificationPublisher {

    private Notification notification;
    private List<User> users = new ArrayList<>();

    public void addObserver(User user) {
        this.users.add(user);
    }

    public void removeObserver(User user) {
        this.users.remove(user);
    }

    public void sendNotification(Notification notification, NotificationChannelAdapter notificationChannel) {
        this.notification = notification;
        if (notificationChannel == null) return;
        for (User user : users) {
            if (notification.getNotificationStrategy().getNotificationChannel().equals(notificationChannel.getChannelType())) {
                notificationChannel.send(notification, user);
            }
        }
    }

}
