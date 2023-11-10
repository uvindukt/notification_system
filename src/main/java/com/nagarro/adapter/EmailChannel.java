package com.nagarro.adapter;

import com.nagarro.constant.SystemConstant;
import com.nagarro.model.Notification;
import com.nagarro.model.User;

public class EmailChannel implements NotificationChannelAdapter {

    @Override
    public void send(Notification notification, User user) {
        System.out.println("Preparing Email ...");
        System.out.println("Subject : " + notification.getSubject());
        System.out.println("Body : " + notification.getBody());
        notification.notify(user);
    }

    @Override
    public String getChannelType() {
        return SystemConstant.EMAIL;
    }

}
