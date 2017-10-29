package com.greenfox.messageservicecorrect.service;

public class TwitterService implements MessageService{

    @Override
    public void sendMessage(String message, String address) {
        System.out.println("Tweet sent to " + address + " with the message " + message);
    }
}
