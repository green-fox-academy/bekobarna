package com.greenfox.todo.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ToDo {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    Integer id;
    String title;
    Boolean urgent;
    Boolean done;

    public ToDo() {
        this.urgent = false;
        this.done = false;
    }

    public ToDo(String title) {
        this.title = title;
        this.urgent = false;
        this.done = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getUrgent() {
        return urgent;
    }

    public void setUrgent(Boolean urgent) {
        this.urgent = urgent;
    }

    public Boolean getDone() {
        return done;
    }

    public void setDone(Boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return title;
    }
}
