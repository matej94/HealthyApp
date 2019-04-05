package com.example.healthyapp.contracts;

public interface BMICalculatorContract {
    interface View{

    }
    interface Presenter{
        String calculateBMIClicked(String height, String weight);
    }
}
