package com.example.healthyapp.database;

import com.example.healthyapp.model.Note;

import io.realm.OrderedRealmCollection;
import io.realm.Realm;

public class NoteDatabaseManager implements INoteDatabaseManager {
    private Realm realm;
    private static NoteDatabaseManager dbManager;

    public NoteDatabaseManager(){
        realm = Realm.getDefaultInstance();
    }
    public static NoteDatabaseManager getDatabaseInstance() {
        if (dbManager == null) {
            dbManager = new NoteDatabaseManager();
        }

        return dbManager;
    }
    @Override
    public OrderedRealmCollection<Note> getAllNotes() {
        return realm.where(Note.class).findAll();
    }

    @Override
    public void addNote(String title, String description, String date) {
        Note note = new Note(title, description, date);

        int id;
        realm.beginTransaction();

        if (realm.where(Note.class).count() == 0) {
            id = 0;
        } else {
            id = realm.where(Note.class).max("id").intValue() + 1;
        }

        note.setId(id);

        realm.copyToRealm(note);
        realm.commitTransaction();
    }

    @Override
    public void deleteTask(int id) {
        if (id >= 0) {
            realm.beginTransaction();

            Note deletedNote = realm.where(Note.class).equalTo("id", id).findFirst();

            if (deletedNote != null) {
                deletedNote.deleteFromRealm();
            }

            realm.commitTransaction();
        }
    }
}
