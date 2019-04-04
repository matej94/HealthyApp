package com.example.healthyapp.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.healthyapp.R;
import com.example.healthyapp.contracts.BMICalculatorContract;
import com.example.healthyapp.presenter.BMICalculatorPresenter;

public class BMICalculatorScreen extends AppCompatActivity implements BMICalculatorContract.View {
    EditText HeightEt, WeightEt;
    Button CalculateBtn;
    TextView ResultTv;
    private BMICalculatorContract.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmicalculator_screen);
        initView();
        presenter = new BMICalculatorPresenter(this);
    }
    private void initView(){
        HeightEt = findViewById(R.id.heightEt);
        WeightEt = findViewById(R.id.weightEt);
        CalculateBtn = findViewById(R.id.calculateBtn);
        ResultTv = findViewById(R.id.resultTv);
    }
}
