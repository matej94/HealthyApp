package com.example.healthyapp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.healthyapp.R;
import com.example.healthyapp.contracts.NewsContract;
import com.example.healthyapp.network.NetworkManager;
import com.example.healthyapp.model.News;
import com.example.healthyapp.presenter.NewsPresenter;
import com.example.healthyapp.view.adapter.NewsAdapter;

import java.util.List;

public class NewsScreen extends AppCompatActivity implements NewsContract.View {
    private NewsContract.Presenter presenter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_screen);
        initView();
        presenter = new NewsPresenter(this, NetworkManager.getInstance());
        presenter.getNews();

    }

    private void initView(){
        recyclerView = findViewById(R.id.recycler_news);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);
    }

    @Override
    public void showNews(List<News> newsList) {
        NewsAdapter adapter = new NewsAdapter(getApplicationContext(), newsList);
        recyclerView.setAdapter(adapter);
    }
}
