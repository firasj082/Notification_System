package com.Notification_System.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.Notification_System.app.models.LogSender;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class configuration {

    @Bean
    public LogSender logSender(@Value("${app.welcome.message}") String message) {
        return new LogSender(message);
    }
}
