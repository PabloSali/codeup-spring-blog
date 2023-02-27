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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "ad")
    private List<AdImage> images;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "ads_categories",
            joinColumns = {@JoinColumn(name = "ad_id")},
            inverseJoinColumns = {@JoinColumn(name = "category_id")}
    )
    private List<AdCategory> categories;
    @ManyToOne
    private User owner;

    public Ad(){};

    public Ad(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Ad(long id, String title, String description){
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Ad(String title, String description, User owner) {
        this.title = title;
        this.description = description;
        this.owner = owner;
    }

    public User getOwner() { return owner; }

    public void setOwner(User owner) { this.owner = owner; }

    public List<AdImage> getImages() { return images; }

    public void setImages(List<AdImage> images) { this.images = images; }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getTitle() { return title; }

    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public List<AdCategory> getCategories() { return categories; }

    public void setCategories(List<AdCategory> categories) { this.categories = categories; }

    @Override
    public String toString() {
        return "Ad{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", images=" + images +
                ", categories=" + categories +
                '}';
    }
}
