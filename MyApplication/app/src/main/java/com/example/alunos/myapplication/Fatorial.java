package com.example.alunos.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.alunos.myapplication.R;

public class Fatorial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fatorial);
    }
    public void calcular(View v) {
        EditText t1 = (EditText) findViewById(R.id.input_fatorial);
        if (t1.getText().toString().compareTo("") != 0) {
            String number = t1.getText().toString();
            int n1 = Integer.parseInt(number);
            for (int i = (n1 - 1); i > 1; i--) {
                n1 *= i;
            }
            TextView t2 = (TextView) findViewById(R.id.fatorial_output);
            t2.setText(String.valueOf(n1));
            t1.setText("");
        }
    }
}