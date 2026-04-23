package com.Notification_System.app.models;
import org.springframework.stereotype.*;

@Component
public class SmsSender implements MessageSender{

    @Override
    public void send(String message) {
        System.out.println("Sms :" + message);
    }
}
