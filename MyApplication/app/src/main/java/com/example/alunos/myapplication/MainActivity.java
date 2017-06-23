package com.example.alunos.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import com.example.alunos.myapplication.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calc (View v) {
        Intent it = new Intent(this,Calculadora.class);
        startActivity(it);
    }
    public void fat (View v) {
        Intent it = new Intent(this,Fatorial.class);
        startActivity(it);
    }

    public void fib (View v) {
        Intent it = new Intent(this,Fibonacci.class);
        startActivity(it);
    }


}