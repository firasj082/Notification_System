package com.Notification_System.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.Notification_System.app.models.LogSender;

@Configuration
public class configuration {

    @Bean
    public LogSender logSender() {
        return new LogSender();
    }
}
