package com.sayyidisal.awesomeapp;

/**
 * Created by Sayyid Shalahuddin on 9/22/2021.
 */
public class MainModel {
    private int id;
    private String originalUrl,mediumUrl, url, photographer, photographer_url, smallUrl;

    public MainModel() {
    }

    public MainModel(int id, String originalUrl, String mediumUrl, String url, String photographer, String photographer_url, String smallUrl) {
        this.id = id;
        this.originalUrl = originalUrl;
        this.mediumUrl = mediumUrl;
        this.url = url;
        this.photographer = photographer;
        this.photographer_url = photographer_url;
        this.smallUrl = smallUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPhotographer() {
        return photographer;
    }

    public void setPhotographer(String photographer) {
        this.photographer = photographer;
    }

    public String getPhotographer_url() {
        return photographer_url;
    }

    public void setPhotographer_url(String photographer_url) {
        this.photographer_url = photographer_url;
    }

    public String getSmallUrl() {
        return smallUrl;
    }

    public void setSmallUrl(String smallUrl) {
        this.smallUrl = smallUrl;
    }

    public String getMediumUrl() {
        return mediumUrl;
    }

    public void setMediumUrl(String mediumUrl) {
        this.mediumUrl = mediumUrl;
    }
}