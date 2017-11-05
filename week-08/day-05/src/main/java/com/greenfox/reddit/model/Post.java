package com.greenfox.reddit.model;


import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    public Long id;
    public int score;
    String content;

    public LocalDate date;

    public Post(int score) {
        this.score = score;
        this.date = LocalDate.now();
    }

    public Post() {
        this.date = LocalDate.now();
    }

    public Post(String content) {
        this.content = content;
        this.score = 0;
        this.date = LocalDate.now();
    }

    public Post(int score, String content) {
        this.score = score;
        this.content = content;
        this.date = LocalDate.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }



}
