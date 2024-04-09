package com.example.myexam;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import android.widget.TextView;

public class activity_time_converter extends AppCompatActivity {

    private RadioButton hour_to_min;
    private RadioButton hour_to_sec;
    private RadioButton min_to_sec;
    private RadioButton min_to_hour;
    private RadioButton sec_to_hour;
    private RadioButton sec_to_min;
    private EditText timeText;
    private TextView text;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_converter);

        timeText=findViewById(R.id.time_converterText);
        hour_to_sec=findViewById(R.id.hour_to_sec);
        hour_to_min=findViewById(R.id.hour_to_min);
        min_to_hour=findViewById(R.id.min_to_hour);
        min_to_sec=findViewById(R.id.min_to_sec);
        sec_to_hour=findViewById(R.id.sec_to_hour);
        sec_to_min=findViewById(R.id.sec_to_min);
        text=findViewById(R.id.time_converted);
    }

    public void timeConverter(View view){

        timeConverter();
    }

    public void timeConverter()
    {
        int time;
        int result;
        int rest;
        String display;
        time= Integer.parseInt(timeText.getText().toString());

        if(hour_to_min.isChecked())
        {
            result=time*60;
            display=String.format(" %d ",result);
        } else if (hour_to_sec.isChecked())
        {
            result=time*3600;
            display=String.format(" %d ",result);
        }
        else if (min_to_sec.isChecked())
        {
            result=time*60;
            display=String.format(" %d ",result);
        }
        else if (min_to_hour.isChecked())
        {
            result=time/60;
            rest=time%60;
            display=String.format(" %d h : %d min ",result,rest);
        }
        else if (sec_to_hour.isChecked())
        {
            result=time/3600;
            rest=time%3600;
            display=String.format(" %d h : %d s ",result,rest);
        }
        else if (sec_to_min.isChecked())
        {
            result=time/60;
            rest=time%60;
            display=String.format(" %d min : %d s ",result,rest);
        }
        else
            display=("ERROR!");
        text.setText(display);
    }
}