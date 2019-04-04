package com.example.healthyapp.presenter;

import com.example.healthyapp.contracts.DiaryContract;

public class DiaryPresenter implements DiaryContract.Presenter {
    private DiaryContract.View view;

    public DiaryPresenter(DiaryContract.View view){
        this.view = view;
    }

    @Override
    public void loadAddNewNoteScreen() {
        view.navigateToAddNewNoteScreen();
    }
}
