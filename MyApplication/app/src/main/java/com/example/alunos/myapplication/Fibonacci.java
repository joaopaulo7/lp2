package com.example.alunos.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


public class Fibonacci extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fibonacci);
    }

    public void fibonacci(View v){
        EditText entrada = (EditText) findViewById(R.id.entrada);
        int n = Integer.parseInt(entrada.getText().toString());
        int[] lista = new int[n];
        lista[0] = 0;
        lista[1] = 1;
        for (int i = 2; i < n; i++)
        {
            lista[i] = lista[i-1]+lista[i-2];
        }
        elemento(lista[n]);
        soma(lista, n);
        listar(lista, n);
    }

    private void elemento(int n){
        TextView t = (TextView) findViewById(R.id.elemento);
        t.setText(String.valueOf(n));
    }

    private void soma(int[] v, int n){
        int sum = 0;
        for (int i = 2; i < n; i++)
        {
            sum =+ v[i];
        }
        TextView t = (TextView) findViewById(R.id.soma);
        t.setText(String.valueOf(sum));
    }

    private void listar(int[] v, int n){
        String s= "";
        for (int i = 2; i < n; i++)
        {
            s = s + String.valueOf((v[i]));
        }
        TextView t = (TextView) findViewById(R.id.lista);
        t.setText(s);
    }

}