package com.example.healthyapp.contracts;

import com.example.healthyapp.model.News;
import java.util.List;


public interface NewsContract {
    interface View{
        void showNews(List<News> newsList);

    }
    interface Presenter{
        void getNews();
        void fetchData();


    }
}
