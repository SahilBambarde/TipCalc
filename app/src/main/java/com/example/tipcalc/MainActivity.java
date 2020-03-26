package com.example.tipcalc;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    EditText bill;
    EditText tip_percentage;
    TextView tipamount;
    TextView finalamount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View v) {

        EditText bill = (EditText) findViewById(R.id.bill);
        EditText tip_percentage = (EditText) findViewById(R.id.tip_percentage);
        TextView tipamount = (TextView) findViewById(R.id.tipamount);
        TextView finalamount = (TextView) findViewById(R.id.result);


        float billamount = Float.parseFloat(bill.getText().toString());
        float percentage = Float.parseFloat(tip_percentage.getText().toString());

        float tip = billamount * percentage;
        float result = billamount + tip;

        tipamount.setText((int) tip);
        finalamount.setText((int) result);
    }
}
