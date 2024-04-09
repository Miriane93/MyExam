package com.example.myexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class activity_map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
    }


    public void position(View view)
    {
        EditText position_text=findViewById(R.id.location_text);
        String position_string=position_text.getText().toString();
        Intent intent=new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        position_string=position_string.replaceAll(" ", "+");
        intent.setData(Uri.parse("geo:0,0?q="+ position_string));
        startActivity(intent);

    }
}