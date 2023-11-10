package com.nagarro.adapter;

import com.nagarro.model.Notification;
import com.nagarro.model.User;

public interface NotificationChannelAdapter {

    public void send(Notification notification, User user);

    public String getChannelType();

}
