package com.example.healthyapp.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class Note extends RealmObject {
    @PrimaryKey
    private int id;
    private String title;
    private String description;
    private String date;

    public Note (){}

    public Note (String title, String description, String date){
        this.title = title;
        this.description = description;
        this.date = date;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription(){
        return description;
    }
    public String getDate(){
        return date;
    }

}
