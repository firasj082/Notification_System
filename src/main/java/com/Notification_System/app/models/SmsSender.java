package com.Notification_System.app.models;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.*;

@Component
public class SmsSender implements MessageSender{

    private final String message;

    public SmsSender(@Value("${app.welcome.message}") String message) {

        this.message = message;
    }
    @Override
    public void send(String message) {
        System.out.println("Sms :" + message);
    }
    @Override
    public void send() {
        System.out.println("Sms :" + this.message);
    }
}
