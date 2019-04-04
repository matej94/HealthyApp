package com.example.healthyapp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;

import com.example.healthyapp.R;
import com.example.healthyapp.contracts.AddNewNoteContract;
import com.example.healthyapp.presenter.AddNewNotePresenter;

public class AddNewNoteScreen extends AppCompatActivity implements AddNewNoteContract.View {
    EditText TitleEt, DescriptionEt;
    CalendarView DateCv;
    Button AddNoteBtn;
    private AddNewNoteContract.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_note_screen);
        initView();
        presenter = new AddNewNotePresenter(this);
    }
    private void initView(){
        TitleEt = findViewById(R.id.titleEt);
        DescriptionEt = findViewById(R.id.descriptionEt);
        DateCv = findViewById(R.id.dateCv);
        AddNoteBtn = findViewById(R.id.addNoteBtn);
    }
}
