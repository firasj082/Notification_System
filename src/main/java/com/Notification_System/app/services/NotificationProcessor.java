package com.Notification_System.app.services;

import com.Notification_System.app.models.MessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationProcessor {

    private final MessageSender sender;

    @Autowired
    public NotificationProcessor(@Qualifier("smsSender") MessageSender messageSender) {

        this.sender = messageSender;
    }

    public MessageSender getSender() {
        return this.sender;
    }

    public void process (String message) {
        getSender().send(message);
    }
}
