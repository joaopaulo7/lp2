package com.example.alunos.myapplication;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.alunos.myapplication.R;

import java.util.Stack;
public class Calculadora extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora2);
    }

    Stack pilha = new Stack();
    int tam = 0;

    public void empilhar(View v) {
        TextView txt1 = (TextView) findViewById(R.id.inputNumber);
        if (txt1.getText().toString().compareTo("") != 0) {
            double number = Double.parseDouble(txt1.getText().toString());
            pilha.push(number);
            txt1.setText("");
            setText();
            tam++;
        }
    }

    public void soma(View v) {
        if (tam > 1) {
            double var1 = (double) pilha.pop();
            double var2 = (double) pilha.pop();
            double var3 = var1 + var2;
            pilha.push(var3);
            setText();
            tam--;
        }
    }

    public void subtracao(View v) {
        if (tam > 1) {
            double var1 = (double) pilha.pop();
            double var2 = (double) pilha.pop();
            double var3 = var1 - var2;
            pilha.push(var3);
            setText();
            tam--;
        }
    }

    public void multiplicacao(View v) {
        if (tam > 1) {
            double var1 = (double) pilha.pop();
            double var2 = (double) pilha.pop();
            double var3 = var1 * var2;
            pilha.push(var3);
            setText();
            tam--;
        }
    }

    public void divisao(View v) {
        if (tam > 1) {
            double var1 = (double) pilha.pop();
            double var2 = (double) pilha.pop();
            if (var2 != 0) {
                double var3 = var1 / var2;
                pilha.push(var3);
                setText();
                tam--;
            } else {
                pilha.push(var2);
                pilha.push(var1);
            }
        }
    }

    public void desempilhar(View v) {
        if (tam > 0) {
            pilha.pop();
            setText();
            tam--;
        }
    }

    public void limpar(View v) {
        if (tam > 0) {
            pilha.removeAllElements();
            setText();
            tam = 0;
        }
    }

    public void setText() {
        TextView txt2 = (TextView) findViewById(R.id.outputStack);
        txt2.setText(pilha.toString());
    }
}