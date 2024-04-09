package com.example.myexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void start(View view)
    {
        Intent intentPlan= new Intent(this, activity_launcher.class);
        startActivity(intentPlan);
    }

    public void start2(View view)
    {
        Intent intentAll= new Intent(this, activity_launcher2.class);
        startActivity(intentAll);
    }
}