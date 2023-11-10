package com.nagarro.model;

import com.nagarro.strategy.NotificationStrategy;

public class Notification {

    private String subject;
    private String body;

    private NotificationStrategy notificationStrategy;

    public Notification(String subject, String body, NotificationStrategy notificationStrategy) {
        this.subject = subject;
        this.body = body;
        this.notificationStrategy = notificationStrategy;
    }

    public void notify(User user) {
        this.notificationStrategy.notifyUser(user, this);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public NotificationStrategy getNotificationStrategy() {
        return notificationStrategy;
    }

    public void setNotificationStrategy(NotificationStrategy notificationStrategy) {
        this.notificationStrategy = notificationStrategy;
    }
}
