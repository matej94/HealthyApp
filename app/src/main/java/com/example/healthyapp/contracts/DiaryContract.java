package com.example.healthyapp.contracts;

public interface DiaryContract {
    interface View{
        void navigateToAddNewNoteScreen();
    }
    interface Presenter{
        void loadAddNewNoteScreen();
    }
}
