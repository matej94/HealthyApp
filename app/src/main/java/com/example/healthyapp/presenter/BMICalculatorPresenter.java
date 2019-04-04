package com.example.healthyapp.presenter;

import com.example.healthyapp.contracts.BMICalculatorContract;

public class BMICalculatorPresenter implements BMICalculatorContract.Presenter {
    private BMICalculatorContract.View view;

    public BMICalculatorPresenter(BMICalculatorContract.View view){
        this.view = view;
    }
}
