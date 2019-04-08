package com.example.healthyapp.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import com.example.healthyapp.R;
import com.example.healthyapp.contracts.DiaryContract;
import com.example.healthyapp.model.Note;
import com.example.healthyapp.model.NoteDatabaseManager;
import com.example.healthyapp.presenter.DiaryPresenter;

import io.realm.OrderedRealmCollection;

public class DiaryScreen extends AppCompatActivity implements DiaryContract.View {
    Button AddNewNoteBtn;
    ListView NotesLv;
    private DiaryContract.Presenter presenter;
    private NoteAdapter noteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary_screen);
        initView();
        presenter = new DiaryPresenter(this, NoteDatabaseManager.getDatabaseInstance());
    }
    @Override
    protected void onResume() {
        super.onResume();

        presenter.getNotes();
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
        NotesLv.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Note note = (Note) parent.getAdapter().getItem(position);
                presenter.deleteNoteClicked(note.getId());
                return true;
            }
        });
    }

    @Override
    public void navigateToAddNewNoteScreen() {
        Intent intent = new Intent(this, AddNewNoteScreen.class);
        startActivity(intent);
    }

    @Override
    public void showNotes(OrderedRealmCollection<Note> noteList) {
        noteAdapter = new NoteAdapter(noteList);
        NotesLv.setAdapter(noteAdapter);
    }
}
