package com.example.healthyapp.contracts;

public interface AddNewNoteContract {
    interface View{

    }
    interface Presenter{
        void addNoteClicked(String title, String description, String date);

    }
}
