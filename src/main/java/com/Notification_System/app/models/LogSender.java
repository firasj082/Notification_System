package com.Notification_System.app.models;

import org.springframework.beans.factory.annotation.Value;

public class LogSender implements MessageSender {

    private final String message;

    public LogSender(@Value("${app.welcome.message}") String message) {

        this.message = message;
    }
    @Override
    public void send(String message) {
        System.out.println("Log: " + message);
    }
    @Override
    public void send() { System.out.println("Log :" + this.message); }
}
