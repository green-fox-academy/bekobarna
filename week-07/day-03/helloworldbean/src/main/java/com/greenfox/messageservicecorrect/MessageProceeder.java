package com.greenfox.messageservicecorrect;

import com.greenfox.messageservicecorrect.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageProceeder {

    @Autowired
    MessageService messageService;

    public void processMessage(String message, String address){
        messageService.sendMessage(message, address);
    }
}
