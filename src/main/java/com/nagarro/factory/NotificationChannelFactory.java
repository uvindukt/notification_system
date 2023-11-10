package com.nagarro.factory;

import com.nagarro.adapter.EmailChannel;
import com.nagarro.adapter.NotificationChannelAdapter;
import com.nagarro.adapter.SmsChannel;
import com.nagarro.constant.SystemConstant;

public class NotificationChannelFactory {

    private static NotificationChannelFactory notificationChannelFactory;

    private NotificationChannelFactory() {
    }

    public static NotificationChannelFactory getInstance() {
        if (notificationChannelFactory == null) {
            notificationChannelFactory = new NotificationChannelFactory();
        }
        return notificationChannelFactory;
    }

    public NotificationChannelAdapter getNotificationChannel(String notificationChannel) {

        if (notificationChannel == null) {
            return null;
        }

        if (notificationChannel.equalsIgnoreCase(SystemConstant.EMAIL)) {
            return new EmailChannel();

        } else if (notificationChannel.equalsIgnoreCase(SystemConstant.SMS)) {
            return new SmsChannel();
        }

        return null;

    }

}
