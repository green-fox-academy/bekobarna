package com.greenfox.bekob.myapplication.model;

/**
 * Created by bekob on 2017-11-16.
 */

public class Client {
    String id;

    public Client(String id) {
        this.id = System.getenv("CHAT_APP_UNIQUE_ID");
    }

    public Client() {
        id = System.getenv("CHAT_APP_UNIQUE_ID");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
