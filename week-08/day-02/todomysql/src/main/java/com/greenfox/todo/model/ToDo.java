package com.greenfox.todo.model;


import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class ToDo {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    Integer id;
    String title;
    Boolean urgent;
    Boolean done;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate date;


    @DateTimeFormat(pattern = "yyyy-MM-dd")
    LocalDate duedate;


    public ToDo() {
        this.done = false;
        this.urgent = false;
        this.date = LocalDate.now();
    }

    public ToDo(String title, LocalDate date) {
        this.title = title;
        this.urgent = false;
        this.done = false;
        this.date = LocalDate.now();
        this.duedate = date;
    }

    public LocalDate getDuedate() {
        return duedate;
    }

    public void setDuedate(LocalDate duedate) {
        this.duedate = duedate;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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
