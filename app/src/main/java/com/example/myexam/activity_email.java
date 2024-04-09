package com.example.myexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class activity_email extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);
    }

    public void email(View view) {
        EditText subject_text = findViewById(R.id.email_subject);
        EditText mail_to_text = findViewById(R.id.email_to);
        EditText mail_text = findViewById(R.id.mail_text);
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{mail_to_text.getText().toString()});
        intent.putExtra(Intent.EXTRA_SUBJECT, subject_text.getText().toString());
        intent.putExtra(Intent.EXTRA_TEXT, mail_text.getText().toString());
        startActivity(intent);
    }
}