package com.nagarro.strategy;

import com.nagarro.model.Notification;
import com.nagarro.model.User;

public interface NotificationStrategy {

    public void notifyUser(User user, Notification notification);

    public String getNotificationChannel();

}
