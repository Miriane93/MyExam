package com.example.myexam;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.lang.String;


public class activity_contacts extends AppCompatActivity {

    public static final String myPREFERENCES = "myPrefs";
    public static final String Name = "nameKey";
    public static final String Phone = "phoneKey";
    public static final String Email = "emailKey";
    public static final String CONTACT_COUNT_KEY = "contactCount";

    Button s1,v1,cl1;
    EditText ed1, ed2, ed3;
    SharedPreferences sharedPreferences;
    int contactCount;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        ed1 = findViewById(R.id.c1_name_editText);
        ed2 = findViewById(R.id.c1_email_editText);
        ed3 = findViewById(R.id.c1_phone_editText);
        s1 = findViewById(R.id.s1_button);
        v1 =findViewById(R.id.v1_button);
        cl1=findViewById(R.id.cl1_button);

        sharedPreferences = getSharedPreferences(myPREFERENCES, MODE_PRIVATE);
        contactCount = sharedPreferences.getInt(CONTACT_COUNT_KEY, 1);

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String n=ed1.getText().toString();
                String tel=ed2.getText().toString();
                String em=ed3.getText().toString();

                SharedPreferences.Editor editor=sharedPreferences.edit();

                editor.putString(Name + contactCount,n);
                editor.putString(Phone + contactCount,tel);
                editor.putString(Email + contactCount,em);
                editor.putInt(CONTACT_COUNT_KEY, contactCount + 1);
                editor.apply();

                Toast.makeText(activity_contacts.this,"Thanks",Toast.LENGTH_LONG).show();

                ed1.getText().clear();
                ed2.getText().clear();
                ed3.getText().clear();
            }
        });

        v1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String enteredName = ed1.getText().toString();
                boolean contactFound = false;
                for (int i = 1; i < contactCount; i++) {
                    String contactName = sharedPreferences.getString(Name + i, "");
                    if (enteredName.equals(contactName)) {
                        String tel = sharedPreferences.getString(Phone + i, "Phone");
                        String em = sharedPreferences.getString(Email + i, "Email");

                        ed2.setText(tel);
                        ed3.setText(em);
                        contactFound=true;
                        return;
                    }
                }
                if(!contactFound){
                    Toast.makeText(activity_contacts.this, "Not Founded", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                ed1.getText().clear();
                ed2.getText().clear();
                ed3.getText().clear();
            }
        });

    }





}