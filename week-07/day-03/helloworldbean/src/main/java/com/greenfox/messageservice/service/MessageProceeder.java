package com.greenfox.messageservice.service;

import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {
    String type;

    public MessageProceeder(EmailService emailService) {
        this.type = emailService.type;
    }

    public MessageProceeder(TwitterService twitterService) {
        this.type = twitterService.type;
    }


    public void processMessage(String message, String messageType) {
        System.out.println(type + " Sent to " + messageType + " with Message= " + message);
    }
}

 //   Email Sent to office@greenfox.com with Message=Hi Barba! How are you?



