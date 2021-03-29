package com.umb.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer defaultValue = 0;
    // declare buttons
    private Button buttonSum;
    private Button buttonSustration;
    private Button buttonMultiplication;
    private Button buttonDivition;
    // Declare views
    private TextView textResponse;
    private TextView firstInput;
    private TextView secondInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Views
        textResponse = findViewById(R.id.response);
        firstInput = findViewById(R.id.input1);
        secondInput = findViewById(R.id.input2);
        // Buttons
        buttonSum = findViewById(R.id.bSum);
        buttonSustration = findViewById(R.id.bSust);
        buttonMultiplication = findViewById(R.id.bMult);
        buttonDivition = findViewById(R.id.BDivi);
        //Listeners
        buttonSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResponse.setText(reset());
                textResponse.setText(operator(Integer.parseInt(firstInput.getText().toString()), Integer.parseInt(secondInput.getText().toString()), "+"));
            }
        });
        buttonSustration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResponse.setText(reset());
                textResponse.setText(operator(Integer.parseInt(firstInput.getText().toString()), Integer.parseInt(secondInput.getText().toString()), "-"));
            }
        });
        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResponse.setText(reset());
                textResponse.setText(operator(Integer.parseInt(firstInput.getText().toString()), Integer.parseInt(secondInput.getText().toString()), "*"));
            }
        });
        buttonDivition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textResponse.setText(reset());
                textResponse.setText(operator(Integer.parseInt(firstInput.getText().toString()), Integer.parseInt(secondInput.getText().toString()), "/"));
            }
        });


    }
    // Basic Math methods
    public String operator(int a, int b, String C) {
        int result = defaultValue;
        switch (C)
        {
            case "+":  result = a+b;
                break;
            case "-":  result = a-b;
                break;
            case "*":  result = a*b;
                break;
            case "/":  result = a/b;
                break;
            default: result = defaultValue;
                break;
        }
        return String.valueOf(result);
    }
    // Clear

    public String reset() {
        return String.valueOf(defaultValue);
    }
}