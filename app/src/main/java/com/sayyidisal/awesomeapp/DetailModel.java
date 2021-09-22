package com.sayyidisal.awesomeapp;

/**
 * Created by Sayyid Shalahuddin on 9/23/2021.
 */
public class DetailModel {
    private String title;
    private String petunjuk;
    private boolean expanded;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPetunjuk() {
        return petunjuk;
    }

    public void setPetunjuk(String petunjuk) {
        this.petunjuk = petunjuk;
    }

    public boolean isExpanded() {
        return expanded;
    }

    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }

    public DetailModel(String title, String petunjuk){
        this.title = title;
        this.petunjuk = petunjuk;
        this.expanded = false;
    }
}
