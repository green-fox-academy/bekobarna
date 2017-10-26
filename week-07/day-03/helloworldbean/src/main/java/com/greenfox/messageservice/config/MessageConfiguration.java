package com.greenfox.messageservice.config;


import com.greenfox.messageservice.service.EmailService;
import com.greenfox.messageservice.service.MessageProceeder;
import com.greenfox.messageservice.service.TwitterService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {

    @Bean
    public MessageProceeder emailProceeder () {
        return new MessageProceeder(new EmailService()) {
        };
    }

    @Bean
    public MessageProceeder twitterProceeder () {
        return new MessageProceeder(new TwitterService()) {
        };
    }

}
