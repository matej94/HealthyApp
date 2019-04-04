package com.example.healthyapp.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.example.healthyapp.R;
import com.example.healthyapp.contracts.DiaryContract;
import com.example.healthyapp.presenter.DiaryPresenter;

public class DiaryScreen extends AppCompatActivity implements DiaryContract.View {
    Button AddNewNoteBtn;
    ListView NotesLv;
    private DiaryContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary_screen);
        initView();
        presenter = new DiaryPresenter(this);
    }
    private void initView(){
        AddNewNoteBtn = findViewById(R.id.addNewNoteBtn);
        AddNewNoteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loadAddNewNoteScreen();
            }
        });
        NotesLv = findViewById(R.id.notesLv);
    }

    @Override
    public void navigateToAddNewNoteScreen() {
        Intent intent = new Intent(this, AddNewNoteScreen.class);
        startActivity(intent);
    }
}
