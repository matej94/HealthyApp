package com.example.healthyapp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import com.example.healthyapp.R;
import com.example.healthyapp.contracts.NewsContract;
import com.example.healthyapp.presenter.NewsPresenter;

public class NewsScreen extends AppCompatActivity implements NewsContract.View {
    Button LoadNewsBtn;
    ListView NewsLv;
    private NewsContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_screen);
        initView();
        presenter = new NewsPresenter(this);
    }
    private void initView(){
        LoadNewsBtn = findViewById(R.id.loadNewsBtn);
        NewsLv = findViewById(R.id.newsLv);
    }
}
