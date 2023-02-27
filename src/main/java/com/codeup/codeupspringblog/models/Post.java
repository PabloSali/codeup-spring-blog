package com.codeup.codeupspringblog.models;

import jakarta.persistence.*;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 150, nullable = false)
    private String title;
    @Column(columnDefinition = "TEXT NOT NULL")
    private String body;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Post(){};

    public Post(String title, String body){
        this.title = title;
        this.body = body;
    }

    public Post(String title, String body, User user) {
        this.title = title;
        this.body = body;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
