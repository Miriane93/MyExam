package com.example.myexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_launcher2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher2);
    }

    public void converter(View view)
    {
        Intent intentConv= new Intent(this, activity_converter.class);
        startActivity(intentConv);
    }

    public void openMap(View view){

        Intent intentMap= new Intent(this, activity_map.class);
        startActivity(intentMap);
    }

    public void openDownloader(View view){
        Intent intentIm=new Intent(this,activity_image.class);
        startActivity(intentIm);
    }

    public  void calculator(View view){

        Intent intentCalc=new Intent(this, activity_calculator.class);
        startActivity(intentCalc);
    }
}