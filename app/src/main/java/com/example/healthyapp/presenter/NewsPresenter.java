package com.example.healthyapp.presenter;

import com.example.healthyapp.contracts.NewsContract;
import com.example.healthyapp.network.INetworkManager;
import com.example.healthyapp.model.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NewsPresenter implements NewsContract.Presenter {
    private NewsContract.View view;
    private INetworkManager networkManager;
    private List<News> newsList;

    public NewsPresenter(NewsContract.View view, INetworkManager networkManager) {
        this.view = view;
        this.networkManager = networkManager;
    }

    @Override
    public void getNews() {
        fetchData();
    }

    @Override
    public void fetchData() {
        networkManager.getNewsList(getNewsListCallback());
    }

    protected Callback<List<News>> getNewsListCallback() {
        return new Callback<List<News>>() {
            @Override
            public void onResponse(Call<List<News>> call, Response<List<News>> response) {
                if (response != null && response.body() != null ) {
                    newsList = response.body();
                    view.showNews(newsList);
                }
            }

            @Override
            public void onFailure(Call<List<News>> call, Throwable t) {
            }
        };
    }
}