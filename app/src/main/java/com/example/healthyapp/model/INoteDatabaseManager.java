package com.example.healthyapp.model;

import io.realm.OrderedRealmCollection;

public interface INoteDatabaseManager {
    OrderedRealmCollection<Note> getAllNotes();
    void addNote(String title, String description, String date);
    void deleteTask(int id);
}
