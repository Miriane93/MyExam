package com.example.myexam;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class activity_currency_converter extends AppCompatActivity {

    private RadioButton eur_to_cad;
    private RadioButton eur_to_usd;
    private RadioButton eur_to_ster;
    private RadioButton eur_to_itl;
    private RadioButton eur_to_fcfa;
    private EditText currText;
    private TextView text;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency_converter);

        eur_to_cad=findViewById(R.id.eur_cad);
        eur_to_usd=findViewById(R.id.eur_usd);
        eur_to_ster=findViewById(R.id.eur_ster);
        eur_to_itl=findViewById(R.id.eur_itl);
        eur_to_fcfa=findViewById(R.id.eur_fcfa);
        text=findViewById(R.id.currency_converted);
        currText=findViewById(R.id.currencyText);
    }

    public void currConverter(View view){

        currConverter();
    }
    public void currConverter()
    {
        double amount;
        double result;
        String display;
        amount=Double.parseDouble(currText.getText().toString());

        if(eur_to_cad.isChecked())
        {
            result=amount*1.47;
            display=String.format(" %.2f $ ",result);
        } else if (eur_to_usd.isChecked())
        {
            result=amount*1.09;
            display=String.format(" %.2f $ ",result);
        }
        else if (eur_to_ster.isChecked())
        {
            result=amount*0.85;
            display=String.format(" %.2f £ ",result);
        }
        else if (eur_to_itl.isChecked())
        {
            result=amount*1936.27;
            display=String.format(" %.2f ITL ",result);
        }
        else if (eur_to_fcfa.isChecked())
        {
            result=amount*655.96;
            display=String.format(" %.2f F CFA ",result);
        }
        else
            display=("ERROR!");
        text.setText(display);
    }
}