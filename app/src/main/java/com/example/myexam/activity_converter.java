package com.example.myexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_converter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
    }

    public void converterTemp(View view)
    {
        Intent intentTemp= new Intent(this, activity_temp_converter.class);
        startActivity(intentTemp);
    }

    public void converterTime(View view)
    {
        Intent intentTime= new Intent(this, activity_time_converter.class);
        startActivity(intentTime);
    }

    public void converterCurr(View view)
    {
        Intent intentCurr= new Intent(this, activity_currency_converter.class);
        startActivity(intentCurr);
    }
}