package com.codeup.codeupspringblog.models;
import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.util.List;

@Entity
@Table(name="ads")
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String title;

    @Column(nullable = false)
    private String description;

// ---  Relationship Lecture
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ad")
    private List<AdImage> images;
// ---
    public Ad(){};

    public Ad(long id, String title, String description){ this.id = id; this.title = title; this.description = description; }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
