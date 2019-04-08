package com.example.healthyapp.presenter;

import com.example.healthyapp.contracts.AddNewNoteContract;
import com.example.healthyapp.model.INoteDatabaseManager;

public class AddNewNotePresenter implements AddNewNoteContract.Presenter {
    private AddNewNoteContract.View view;
    private INoteDatabaseManager dbInterface;

    public AddNewNotePresenter(AddNewNoteContract.View view, INoteDatabaseManager dbInterface){
        this.view = view;
        this.dbInterface = dbInterface;
    }

    @Override
    public void addNoteClicked(String title, String description, String date) {
        dbInterface.addNote(title, description, date);
    }
}
