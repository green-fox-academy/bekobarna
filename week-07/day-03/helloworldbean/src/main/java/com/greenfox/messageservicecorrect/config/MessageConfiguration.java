package com.greenfox.messageservicecorrect.config;


import com.greenfox.messageservicecorrect.MessageProceeder;
import com.greenfox.messageservicecorrect.service.TwitterService;
import com.greenfox.messageservicecorrect.service.MessageService;
import com.greenfox.messageservicecorrect.service.EmailService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

    @Bean
    public MessageService messageService() {
        return new EmailService();
    }

    public MessageService messageService1() {
        return new TwitterService();
    }

    @Bean
    public MessageProceeder messageProceeder() {
        return new MessageProceeder();
    }

}
