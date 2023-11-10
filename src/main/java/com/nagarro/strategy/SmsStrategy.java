package com.nagarro.strategy;

import com.nagarro.constant.SystemConstant;
import com.nagarro.model.Notification;
import com.nagarro.model.User;

public class SmsStrategy implements NotificationStrategy {

    @Override
    public void notifyUser(User user, Notification notification) {
        System.out.println("SMS send successfully - [User : " + user.getId() + " - " + user.getName() + "]\n");
    }

    @Override
    public String getNotificationChannel() {
        return SystemConstant.SMS;
    }

}
