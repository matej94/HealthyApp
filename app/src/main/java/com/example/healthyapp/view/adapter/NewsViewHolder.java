package com.example.healthyapp.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.healthyapp.R;

public class NewsViewHolder extends RecyclerView.ViewHolder {

    public TextView title;
    public TextView description;

    public NewsViewHolder(View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.newsTitle);
        description =  itemView.findViewById(R.id.newsDescription);
    }
}

