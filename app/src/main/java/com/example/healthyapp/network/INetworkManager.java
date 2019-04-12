package com.example.healthyapp.network;

import com.example.healthyapp.model.News;

import java.util.List;

import retrofit2.Callback;

public interface INetworkManager {

    void getNewsList(Callback<List<News>> newsListCallback);

}

