package com.example.myexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.net.Uri;


public class activity_browser extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser);
    }

    public void browse(View view)
    {
        EditText url= findViewById(R.id.browser_EditText);
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://" +url.getText().toString()));
        startActivity(intent);
    }
}