package com.nagarro.model;

public class User {

    private int id;
    private String name;
    private boolean notificationSubscriptionStatus;

    public User(int id, String name, boolean notificationSubscriptionStatus) {
        this.id = id;
        this.name = name;
        this.notificationSubscriptionStatus = notificationSubscriptionStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getNotificationSubscriptionStatus() {
        return notificationSubscriptionStatus;
    }

    public void setNotificationSubscriptionStatus(boolean notificationSubscriptionStatus) {
        this.notificationSubscriptionStatus = notificationSubscriptionStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", notificationSubscriptionStatus=" + notificationSubscriptionStatus +
                '}';
    }

}
