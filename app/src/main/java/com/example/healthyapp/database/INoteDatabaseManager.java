package com.example.healthyapp.database;

import com.example.healthyapp.model.Note;

import io.realm.OrderedRealmCollection;

public interface INoteDatabaseManager {
    OrderedRealmCollection<Note> getAllNotes();
    void addNote(String title, String description, String date);
    void deleteTask(int id);
}
