package com.example.healthyapp.contracts;

import com.example.healthyapp.model.Note;
import io.realm.OrderedRealmCollection;

public interface DiaryContract {
    interface View{
        void navigateToAddNewNoteScreen();
        void showNotes(OrderedRealmCollection<Note> noteList);

    }
    interface Presenter{
        void loadAddNewNoteScreen();
        void getNotes();
        void deleteNoteClicked(int id);

    }
}
