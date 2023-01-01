package edu.enmu.tipcalculator;
//Ayana Jackson
//Purpose: create tip calculator
//December 2, 2022

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //declare variables
    EditText edit1;
    EditText edit2;
    Button btnCalculate;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assign ids to variables
        edit1 = (EditText) findViewById(R.id.edit1);
        edit2 = (EditText) findViewById(R.id.edit2);
        textView = (TextView) findViewById(R.id.textView);

        btnCalculate = (Button) findViewById(R.id.btnCalculate);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int amount = Integer.parseInt(edit1.getText().toString());
                int taxPercentage = Integer.parseInt(edit2.getText().toString());
                //math for tip
                int mathTip = amount * (taxPercentage/100);
                textView.setText(mathTip);
            }
        });
    }
}