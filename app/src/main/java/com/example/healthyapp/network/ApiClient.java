package com.example.healthyapp.network;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    private static final String BASE_URL = "http://www.mocky.io/";

    private static Retrofit retrofit;

    private static IApiClient apiClient;

    private static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(new OkHttpClient())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }

    public static IApiClient getApiServiceInstance() {
        if (apiClient == null) {
            apiClient = getRetrofitInstance().create(IApiClient.class);
        }
        return apiClient;
    }

}
