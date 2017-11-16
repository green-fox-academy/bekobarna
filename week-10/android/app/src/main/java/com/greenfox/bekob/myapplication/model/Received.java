package com.greenfox.bekob.myapplication.model;

/**
 * Created by bekob on 2017-11-16.
 */

public class Received {
    Message message;
    Client client;

    public Received() {
    }

    public Received(Message message, Client client) {
        this.message = message;
        this.client = client;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}