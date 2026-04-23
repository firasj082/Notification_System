package com.Notification_System.app.models;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailSender implements MessageSender{

    @Override
    public void send(String message) {
        System.out.println("Email: " + message);
    }
}
