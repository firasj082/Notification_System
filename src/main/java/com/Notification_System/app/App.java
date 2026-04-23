package com.Notification_System.app;

import com.Notification_System.app.services.NotificationProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.Notification_System.app");

        NotificationProcessor processor = context.getBean(NotificationProcessor.class);

        processor.process("Hello from Notification System");
    }
}
