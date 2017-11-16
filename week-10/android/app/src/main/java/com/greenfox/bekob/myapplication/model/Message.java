package com.greenfox.bekob.myapplication.model;

import java.sql.Timestamp;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by bekob on 2017-11-16.
 */

public class Message {

    Long id;
    String username;
    String text;
    Timestamp timestamp;

    public Message() {
        this.id = randomId();
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    public Message(String username, String text) {
        this.id = randomId();
        this.username = username;
        this.text = text;
        this.timestamp = new Timestamp(System.currentTimeMillis());
    }

    public Long randomId() {
        long id = ThreadLocalRandom.current().nextLong(1000000,9999999);
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
