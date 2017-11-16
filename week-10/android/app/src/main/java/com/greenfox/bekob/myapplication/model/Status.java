package com.greenfox.bekob.myapplication.model;

/**
 * Created by bekob on 2017-11-16.
 */

public class Status {

    private String status;
    private String message;

    public Status(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public Status(String status) {
        this.status = status;
    }

    public Status() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
