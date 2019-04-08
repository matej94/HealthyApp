package com.example.healthyapp.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.healthyapp.contracts.MainContract;
import com.example.healthyapp.presenter.MainPresenter;
import com.example.healthyapp.R;

public class MainActivity extends AppCompatActivity implements MainContract.View {
    Button NewsBtn, DiaryBtn, BMICalculatorBtn;
    private MainContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        presenter = new MainPresenter(this);
    }

    private void initView() {
        NewsBtn = findViewById(R.id.newsBtn);
        NewsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loadNewsScreen();
            }
        });
        DiaryBtn = findViewById(R.id.diaryBtn);
        DiaryBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loadDiaryScreen();
            }
        });
        BMICalculatorBtn = findViewById(R.id.BMIBtn);
        BMICalculatorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.loadBMICalculatorScreen();
            }
        });
    }

    @Override
    public void navigateToNewsScreen() {
        Intent intent = new Intent(this, NewsScreen.class);
        startActivity(intent);
    }

    @Override
    public void navigateToDiaryScreen() {
        Intent intent = new Intent(this, DiaryScreen.class);
        startActivity(intent);
    }

    @Override
    public void navigateToBMICalculatorScreen() {
        Intent intent = new Intent(this, BMICalculatorScreen.class);
        startActivity(intent);
    }
}
