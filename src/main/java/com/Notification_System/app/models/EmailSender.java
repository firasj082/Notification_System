package com.Notification_System.app.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailSender implements MessageSender{

    private final String message;

    public EmailSender(@Value("${app.welcome.message}") String message) {

        this.message = message;
    }
    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
    @Override
    public void send() {
        System.out.println("Sms :" + this.message);
    }
}
