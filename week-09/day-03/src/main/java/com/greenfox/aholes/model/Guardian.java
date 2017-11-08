package com.greenfox.aholes.model;


public class Guardian {

    public String received;
    public String translated;

    public Guardian(String received) {
        this.received = received;
        this.translated =  translate();
    }

    public String translate() {
        return this.translated = "I am Groot!";
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received;
    }

    public String getTranslated() {
        return translated;
    }

    public void setTranslated(String translated) {
        this.translated = translated;
    }
}
