package com.example.healthyapp.presenter;

import com.example.healthyapp.contracts.AddNewNoteContract;

public class AddNewNotePresenter implements AddNewNoteContract.Presenter {
    private AddNewNoteContract.View view;

    public AddNewNotePresenter(AddNewNoteContract.View view){
        this.view = view;
    }
}
