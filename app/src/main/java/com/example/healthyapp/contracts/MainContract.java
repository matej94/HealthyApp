package com.example.healthyapp.contracts;

public interface MainContract {
    interface View{
        void navigateToNewsScreen();
        void navigateToDiaryScreen();
        void navigateToBMICalculatorScreen();
    }
    interface Presenter{
        void loadNewsScreen();
        void loadDiaryScreen();
        void loadBMICalculatorScreen();
    }
}
