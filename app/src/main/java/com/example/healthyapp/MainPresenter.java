package com.example.healthyapp;

import com.example.healthyapp.contracts.MainContract;

public class MainPresenter implements MainContract.Presenter {
    private MainContract.View view;

    public MainPresenter(MainContract.View view){
        this.view = view;
    }
    @Override
    public void loadNewsScreen() {
        view.navigateToNewsScreen();
    }

    @Override
    public void loadDiaryScreen() {
        view.navigateToDiaryScreen();
    }

    @Override
    public void loadBMICalculatorScreen() {
        view.navigateToBMICalculatorScreen();
    }
}
