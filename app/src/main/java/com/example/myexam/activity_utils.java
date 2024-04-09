package com.example.myexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_utils extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utils);
    }

    public void browser(View view){

        Intent intentBro=new Intent(this, activity_browser.class);
        startActivity(intentBro);
    }

    public void email(View view){

        Intent intentEm=new Intent(this,activity_email.class);
        startActivity(intentEm);
    }
}