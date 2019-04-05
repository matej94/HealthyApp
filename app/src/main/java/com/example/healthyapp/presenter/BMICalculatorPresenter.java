package com.example.healthyapp.presenter;

import com.example.healthyapp.contracts.BMICalculatorContract;

public class BMICalculatorPresenter implements BMICalculatorContract.Presenter {
    private BMICalculatorContract.View view;

    public BMICalculatorPresenter(BMICalculatorContract.View view){
        this.view = view;
    }

    @Override
    public String calculateBMIClicked(String height, String weight) {
        double doubleBMI = CalculateBMI(Float.valueOf(height), Float.valueOf(weight));
        double BMI = Math.round(doubleBMI * 10) / 10.0;
        if (BMI < 18.5) {
            return ("Your BMI is: " + BMI + "\nYou are UNDERWEIGHT!");
        }
        else if ((BMI >= 18.5) && (BMI < 25.0)) {
            return ("Your BMI is: " + BMI + "\nYou are NORMAL!");
        }
        else if ((BMI >= 25.0) && (BMI < 29.9)) {
            return ("Your BMI is: " + BMI + "\nYou are OVERWEIGHT!");
        }
        else if ((BMI >= 30.0) && (BMI < 34.9)) {
            return ("Your BMI is: " + BMI + "\nYou are OBESE!");
        }
        else {
            return ("Your BMI is: " + BMI + "\nYou are EXTREMLY OBESE!");
        }
    }
    private double CalculateBMI(double height, double weight){
        double BMI = weight/(height*height);
        return BMI;
    }
}
