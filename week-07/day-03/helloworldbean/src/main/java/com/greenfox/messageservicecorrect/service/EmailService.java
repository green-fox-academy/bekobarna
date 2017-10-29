package com.greenfox.messageservicecorrect.service;

public class EmailService implements MessageService {

    @Override
    public void sendMessage(String message, String address) {
        System.out.println("Email sent to " + address + " with the message " + message);
    }
}
