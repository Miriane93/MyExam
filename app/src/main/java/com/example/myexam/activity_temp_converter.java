package com.example.myexam;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class activity_temp_converter extends AppCompatActivity {


    private EditText tempEditText;
    private RadioButton cels_to_fahrRadioButton;
    private RadioButton fahr_to_celsRadioButton;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temp_converter);

        tempEditText= findViewById(R.id.temp_converterText);
        cels_to_fahrRadioButton= findViewById(R.id.cels_to_fahr);
        fahr_to_celsRadioButton= findViewById(R.id.fahr_to_cels);
        text=findViewById(R.id.conversion_message);

    }
    public void tempConverter(View view){
        tempConverter();

    }

    @SuppressLint("DefaultLocale")
    public void tempConverter()
    {
        double result;
        double temperature;
        temperature= Double.parseDouble(tempEditText.getText().toString());
        String display;

        if(cels_to_fahrRadioButton.isChecked())
        {
            result = 32 + temperature * 9 / 5;
            display = String.format(" %.2f°F ", result);
        } else  if(fahr_to_celsRadioButton.isChecked())
        {
            result = (temperature - 32) * 5 / 9;
            display = String.format(" %.2f°C ", result);
        }
        else
            display = "Errore nella selezione della conversione";
        text.setText(display);
    }

}