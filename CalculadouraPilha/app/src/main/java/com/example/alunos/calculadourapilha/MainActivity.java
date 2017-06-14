package com.example.alunos.calculadourapilha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    Stack lista = new Stack<Double>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void mostrar(){
        TextView view2 = (TextView) findViewById(R.id.outputStack);
        view2.setText(lista.toString());
    }

    protected void empilhar(View num){
        TextView view1 = (TextView) findViewById(R.id.editNum);
        if(view1.getText().toString().compareTo("")!=0){
            double numero = Double.parseDouble(view1.getText().toString());
            lista.push(numero);
        }
        this.mostrar();
        view1.setText("");
    }

    protected void desempilhar(View num){
        if(lista.size() > 0)
            lista.pop();
        this.mostrar();
    }

    protected void limpar( ){
        if(lista.size() > 0)
            lista.removeAllElements();
        this.mostrar();
    }

    protected void somar(View num ){
        if(lista.size() > 1) {
            double x = (double) lista.pop();
            double y = (double) lista.pop();
            double z = x + y;
            lista.push(z);
            this.mostrar();
        }
    }

    protected void subtrair(View num ){
        if(lista.size() > 1) {
            double x = (double) lista.pop();
            double y = (double) lista.pop();
            double z = x - y;
            lista.push(z);
            this.mostrar();
        }
    }

    protected void multiplicar(View num ){
        if(lista.size() > 1) {
            double x = (double) lista.pop();
            double y = (double) lista.pop();
            double z = x * y;
            lista.push(z);
            this.mostrar();
        }
    }

    protected void dividir(View num ) {
        if(lista.size() > 1) {
            double x = (double) lista.pop();
            double y = (double) lista.pop();
            double z = x / y;
            lista.push(z);
            this.mostrar();
        }
    }


}
