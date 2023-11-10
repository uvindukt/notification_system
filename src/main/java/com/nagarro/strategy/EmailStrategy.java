package com.nagarro.strategy;

import com.nagarro.constant.SystemConstant;
import com.nagarro.model.Notification;
import com.nagarro.model.User;

public class EmailStrategy implements NotificationStrategy{

    @Override
    public void notifyUser(User user, Notification notification) {
        System.out.println("Email send successfully - [User : " + user.getId() + " - " + user.getName() + "]\n");
    }

    @Override
    public String getNotificationChannel() {
        return SystemConstant.EMAIL;
    }

}
