package com.example.alunos.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.app.AlertDialog;

import static com.example.alunos.myapplication.R.styleable.View;

/**
 * Created by alunos on 27/09/17.
 */

public class AlteraActivity extends AppCompatActivity {
    EditText livro;
    EditText autor;
    EditText editora;
    Button alterar;
    Button deletar;
    Cursor cursor;
    BancoController crud;
    String codigo;

    @Override
    protected void onCreate( Bundle savedInstanceState){
        super.onCreate( savedInstanceState);
        setContentView( R.layout.activity_altera);

        codigo = this.getIntent().getStringExtra("codigo");

        crud = new BancoController( getBaseContext());

        livro = (EditText) findViewById( R.id.alteraTitulo);
        autor = (EditText) findViewById( R.id.alteraAutor);
        editora = (EditText) findViewById( R.id.alteraEditora);

        alterar = (Button) findViewById( R.id.Alterar);

        cursor = crud.carregaDadoById( Integer.parseInt(codigo));
        livro.setText( cursor.getString(cursor.getColumnIndexOrThrow( CriaBanco.TITULO)));
        autor.setText( cursor.getString(cursor.getColumnIndexOrThrow( CriaBanco.AUTOR)));
        editora.setText( cursor.getString(cursor.getColumnIndexOrThrow( CriaBanco.EDITORA)));

        alterar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick ( View view){
                crud.alteraRegistro( Integer.parseInt(codigo), livro.getText().toString(), autor.getText().toString(), editora.getText().toString());
                Intent intent = new Intent (AlteraActivity.this, ConsultaActivity.class);
                startActivity( intent);
                finish();
            }
        });

        deletar = (Button) findViewById( R.id.Apagar);
        deletar.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alerta;
                AlertDialog.Builder builder = new AlertDialog.Builder(AlteraActivity.this);
                builder.setTitle("Apagar");
                builder.setMessage("Deseja mesmo apagar?");
                builder.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        crud.apagaRegistro(Integer.parseInt(codigo));
                        Intent intent = new Intent(AlteraActivity.this, ConsultaActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
                builder.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                alerta = builder.create();
                alerta.show();
            }
        });
    }
}
