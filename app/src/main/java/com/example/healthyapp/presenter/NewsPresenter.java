package com.example.healthyapp.presenter;

import com.example.healthyapp.contracts.NewsContract;

public class NewsPresenter implements NewsContract.Presenter {
    private NewsContract.View view;

    public NewsPresenter(NewsContract.View view){
        this.view = view;
    }
}
