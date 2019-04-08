package com.example.healthyapp.presenter;

import com.example.healthyapp.contracts.DiaryContract;
import com.example.healthyapp.model.INoteDatabaseManager;
import com.example.healthyapp.model.Note;
import io.realm.OrderedRealmCollection;

public class DiaryPresenter implements DiaryContract.Presenter {
    private DiaryContract.View view;
    private INoteDatabaseManager dbInterface;
    private OrderedRealmCollection<Note> noteList;

    public DiaryPresenter(DiaryContract.View view, INoteDatabaseManager dbInterface){
        this.view = view;
        this.dbInterface = dbInterface;
    }

    @Override
    public void loadAddNewNoteScreen() {
        view.navigateToAddNewNoteScreen();
    }

    @Override
    public void getNotes() {
        noteList = dbInterface.getAllNotes();
        view.showNotes(noteList);
    }

    @Override
    public void deleteNoteClicked(int id) {
        dbInterface.deleteTask(id);
        view.showNotes(noteList);
    }
}
