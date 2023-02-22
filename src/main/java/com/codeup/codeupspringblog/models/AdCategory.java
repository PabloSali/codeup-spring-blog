package com.codeup.codeupspringblog.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class AdCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(length = 100)
    private String name;

    @ManyToMany(mappedBy = "categories")
    private List<Ad> ads;

    public AdCategory(){};

    public AdCategory(String name, List<Ad> ads){
        this.name = name;
        this.ads = ads;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ad> getAds() {
        return ads;
    }

    public void setAds(List<Ad> ads) {
        this.ads = ads;
    }
}
