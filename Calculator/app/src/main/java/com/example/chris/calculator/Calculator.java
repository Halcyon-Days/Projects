/*
Written by Christopher Chin
Date: February 21, 2017
Description: This is a simple calculator that can perform basic operations
             This calculator cannot do order of operations, instead it takes 1 number, the operation that is to be performed, then the second number, and when equals is pressed, gives the result. If a third operation is to be done on the values, you must first press equals and then place it in, as trying to put an addtional operation without pressing equals will just change the second operand
             This was made with reference to The Android™Developer’s Cookbook Building Applications with the Android SDK Second Edition, and the tutorial at https://www.youtube.com/watch?v=F-k5gwz_91o&t=1068s
*/


package com.example.chris.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    TextView totalTextView, FirstValue;
    String CurrentValue = "";
    float Value1 = 0, Value2 = 0;
    char operand = '+';
    boolean decimal = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        totalTextView = (TextView) findViewById(R.id.textView);
        FirstValue = (TextView) findViewById(R.id.Val1);

        Button equal = (Button) findViewById(R.id.equal);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(CurrentValue.equals("")){}
                else
                    Value2 = Float.parseFloat(CurrentValue);
                switch (operand) {
                    case '+':
                        Value1 = Value1 + Value2;
                        break;
                    case '-':
                        Value1 = Value1 - Value2;
                        break;
                    case '/':
                        Value1 = Value1 / Value2;
                        break;
                    case 'X':
                        Value1 = Value1 * Value2;
                        break;
                }

                totalTextView.setText(String.valueOf(Value1));
                FirstValue.setText(String.valueOf(Value1));
                CurrentValue = String.valueOf(Value1);
                decimal = true;
                Value1 = 0;
                Value2 = 0;
            }
        });

        Button Add = (Button) findViewById(R.id.addition);
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(CurrentValue.equals("")){}
                else if (Value1 == 0)
                    Value1 = Float.parseFloat(CurrentValue);
                else
                    Value2 = Float.parseFloat(CurrentValue);

                FirstValue.setText(String.valueOf(Value1));
                operand = '+';
                totalTextView.setText(String.valueOf(Value2));
                decimal = false;
                CurrentValue = "";
            }
        });
        Button Sub = (Button) findViewById(R.id.minus);
        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(CurrentValue.equals("")){}
                else if (Value1 == 0)
                    Value1 = Float.parseFloat(CurrentValue);

                else
                    Value2 = Float.parseFloat(CurrentValue);

                FirstValue.setText(String.valueOf(Value1));
                operand = '-';
                totalTextView.setText(String.valueOf(Value2));
                decimal = false;
                CurrentValue = "";
            }
        });
        Button Multi = (Button) findViewById(R.id.multi);
        Multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(CurrentValue.equals("")){}
                else if (Value1 == 0)
                    Value1 = Float.parseFloat(CurrentValue);
                else
                    Value2 = Float.parseFloat(CurrentValue);

                FirstValue.setText(String.valueOf(Value1));
                operand = 'X';
                totalTextView.setText(String.valueOf(Value2));
                decimal = false;
                CurrentValue = "";
            }
        });
        Button Divide = (Button) findViewById(R.id.divide);
        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(CurrentValue.equals("")){}
                else if (Value1 == 0)
                    Value1 = Float.parseFloat(CurrentValue);
                else
                    Value2 = Float.parseFloat(CurrentValue);

                FirstValue.setText(String.valueOf(Value1));
                operand = '/';
                totalTextView.setText(String.valueOf(Value2));
                decimal = false;
                CurrentValue = "";
            }
        });

        Button One = (Button) findViewById(R.id.one);
        One.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentValue += "1";
                totalTextView.setText(CurrentValue);
            }
        });

        Button Two = (Button) findViewById(R.id.two);
        Two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentValue += "2";
                totalTextView.setText(CurrentValue);
            }
        });

        Button Three = (Button) findViewById(R.id.three);
        Three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentValue += "3";
                totalTextView.setText(CurrentValue);
            }
        });

        Button Four = (Button) findViewById(R.id.four);
        Four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentValue += "4";
                totalTextView.setText(CurrentValue);
            }
        });

        Button Five = (Button) findViewById(R.id.five);
        Five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentValue += "5";
                totalTextView.setText(CurrentValue);
            }
        });

        Button Six = (Button) findViewById(R.id.six);
        Six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentValue += "6";
                totalTextView.setText(CurrentValue);
            }
        });

        Button Seven = (Button) findViewById(R.id.seven);
        Seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentValue += "7";
                totalTextView.setText(CurrentValue);
            }
        });

        Button Eight = (Button) findViewById(R.id.eight);
        Eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentValue += "8";
                totalTextView.setText(CurrentValue);
            }
        });

        Button Nine = (Button) findViewById(R.id.nine);
        Nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentValue += "9";
                totalTextView.setText(CurrentValue);
            }
        });

        Button Zero = (Button) findViewById(R.id.zero);
        Zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CurrentValue += "0";
                totalTextView.setText(CurrentValue);
            }
        });

        Button Decimal = (Button) findViewById(R.id.decimal);
        Decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!decimal)
                    CurrentValue += ".";
                totalTextView.setText(CurrentValue);
                decimal = true;
            }
        });

        Button reset = (Button) findViewById(R.id.CE);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!CurrentValue.equals(""))
                    CurrentValue ="";
                else if(Value2 != 0)
                    Value2 = 0;
                else
                    Value1 = 0;

                FirstValue.setText(String.valueOf(Value1));
                decimal = false;
                totalTextView.setText(CurrentValue);
                CurrentValue = "";
        }
        });

        Button sign_button = (Button) findViewById(R.id.sign);
        sign_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(CurrentValue.equals("")){}
                else
                    CurrentValue = String.valueOf(Float.parseFloat(CurrentValue) * (-1));

                totalTextView.setText(CurrentValue);
            }
        });

    }
}