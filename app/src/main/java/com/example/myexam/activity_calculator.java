package com.example.myexam;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.text.DecimalFormatSymbols;
import com.fathzer.soft.javaluator.DoubleEvaluator;





public class activity_calculator extends AppCompatActivity {

    private EditText opText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        opText=(EditText) findViewById(R.id.calcEdit);

        findViewById(R.id.btn_clear).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opText.setText("");
            }
        });


        findViewById(R.id.btn_backspace).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String currentText = opText.getText().toString();
                if (currentText.length() > 0) {
                    opText.setText(currentText.substring(0, currentText.length() - 1));
                }
            }
        });

        findViewById(R.id.btn_0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendText("0");
            }
        });

        findViewById(R.id.btn_1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendText("1");
            }
        });

        findViewById(R.id.btn_2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendText("2");
            }
        });

        findViewById(R.id.btn_3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendText("3");
            }
        });

        findViewById(R.id.btn_4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendText("4");
            }
        });

        findViewById(R.id.btn_5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendText("5");
            }
        });

        findViewById(R.id.btn_6).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendText("6");
            }
        });

        findViewById(R.id.btn_7).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendText("7");
            }
        });

        findViewById(R.id.btn_8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendText("8");
            }
        });

        findViewById(R.id.btn_9).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendText("9");
            }
        });

        findViewById(R.id.btn_divide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendText("/");
            }
        });

        findViewById(R.id.btn_addition).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendText("+");
            }
        });

        findViewById(R.id.btn_substraction).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendText("-");
            }
        });

        findViewById(R.id.btn_multiplication).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendText("*");
            }
        });

        findViewById(R.id.btn_percent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String currentText = opText.getText().toString();
                String[] numbers = currentText.split("\\D+");
                String lastNumber = numbers[numbers.length - 1];

                double number = Double.parseDouble(lastNumber);
                double result = number / 100;

                String updatedText = currentText.replace(lastNumber, String.valueOf(result));

                opText.setText(updatedText);
            }
        });

        findViewById(R.id.btn_decimal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendText(".");
            }
        });

    }

    private void appendText(String text) {
        opText.append(text);
    }
    public void calculate(View view){

        String display;
        double result;
        String text=opText.getText().toString();
        text = text.replaceAll("\\s", "");

        DoubleEvaluator evaluator = new DoubleEvaluator();
        try {
            result = evaluator.evaluate(text);
           // opText.setText(String.valueOf(result));
            opText.append("\n= "+ result);
        } catch (IllegalArgumentException e) {
            opText.setText("Error" + e.getMessage());
        }

    }


}