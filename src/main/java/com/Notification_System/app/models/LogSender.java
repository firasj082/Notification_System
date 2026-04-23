package com.Notification_System.app.models;

public class LogSender implements MessageSender {

    @Override
    public void send(String message) {
        System.out.println("Log: " + message);
    }
}
