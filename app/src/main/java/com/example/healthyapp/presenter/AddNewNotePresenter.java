package com.example.healthyapp.presenter;

import com.example.healthyapp.contracts.AddNewNoteContract;
import com.example.healthyapp.database.INoteDatabaseManager;

public class AddNewNotePresenter implements AddNewNoteContract.Presenter {
    private AddNewNoteContract.View view;
    private INoteDatabaseManager dbInterface;
    private MainPresenter mPresenter;

    public AddNewNotePresenter(AddNewNoteContract.View view, INoteDatabaseManager dbInterface, MainPresenter mPresenter ){
        this.view = view;
        this.dbInterface = dbInterface;
        this.mPresenter = mPresenter;
    }

    @Override
    public void addNoteClicked(String title, String description, String date) {
        dbInterface.addNote(title, description, date);
        mPresenter.loadDiaryScreen();
    }
}
