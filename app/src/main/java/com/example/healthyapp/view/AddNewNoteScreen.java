package com.example.healthyapp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

import com.example.healthyapp.R;
import com.example.healthyapp.contracts.AddNewNoteContract;
import com.example.healthyapp.model.NoteDatabaseManager;
import com.example.healthyapp.presenter.AddNewNotePresenter;

public class AddNewNoteScreen extends AppCompatActivity implements AddNewNoteContract.View {
    EditText TitleEt, DescriptionEt;
    DatePicker DatePicker;
    Button AddNoteBtn;
    private AddNewNoteContract.Presenter presenter;
    String selectedDate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_note_screen);
        initView();
        presenter = new AddNewNotePresenter(this, NoteDatabaseManager.getDatabaseInstance());
    }
    private void initView(){
        TitleEt = findViewById(R.id.titleEt);
        DescriptionEt = findViewById(R.id.descriptionEt);
        DatePicker = findViewById(R.id.datePicker);
        DatePicker.init(DatePicker.getYear(), DatePicker.getMonth(), DatePicker.getDayOfMonth(), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                selectedDate = dayOfMonth + "/" + (monthOfYear + 1) + "/" + year;
            }
        });
        AddNoteBtn = findViewById(R.id.addNoteBtn);
        AddNoteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                presenter.addNoteClicked(TitleEt.getText().toString(), DescriptionEt.getText().toString(),selectedDate);
            }
        });
    }
}
