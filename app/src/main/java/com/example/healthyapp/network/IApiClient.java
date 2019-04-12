package com.example.healthyapp.network;


import com.example.healthyapp.model.News;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IApiClient {
    @GET("v2/5cb0a55d310000850be135e4")
     Call<List<News>> getAllNews();
}
