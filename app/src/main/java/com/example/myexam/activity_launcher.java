package com.example.myexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_launcher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);
    }

    public void utils(View view)
    {
        Intent intentUt=new Intent(this,activity_utils.class);
        startActivity(intentUt);
    }
    public void contacts(View view)
    {
        Intent intentCont=new Intent(this,activity_contacts.class);
        startActivity(intentCont);
    }
}