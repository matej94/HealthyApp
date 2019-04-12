package com.example.healthyapp.network;

import com.example.healthyapp.model.News;

import java.util.List;

import retrofit2.Callback;

public class NetworkManager implements INetworkManager {
    private static NetworkManager networkManager;

    private final IApiClient apiClient;

    public NetworkManager() {
        apiClient = ApiClient.getApiServiceInstance();
    }

    public static NetworkManager getInstance() {
        if (networkManager == null) {
            networkManager = new NetworkManager();
        }

        return networkManager;
    }

    @Override
    public void getNewsList(Callback<List<News>> newsListCallback) {
        apiClient.getAllNews().enqueue(newsListCallback);
    }
}
