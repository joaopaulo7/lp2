package com.example.alunos.myapplication.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.alunos.myapplication.R;
import com.example.alunos.myapplication.model.Pessoa;

import java.util.List;

public class PessoaAdapter extends BaseAdapter {
    private Context context;
    protected List<Pessoa> lista;

    public PessoaAdapter(Context context, List<Pessoa> lista) {
        this.context = context;
        this.lista = lista;
    }

    public int getCount() {
        return lista.size();
    }

    public Object getItem(int posicao) {
        Pessoa obj = lista.get(posicao);
        return obj;
    }

    public long getItemId(int posicao) {
        return posicao;
    }

    public View getView(int posicao, View convertView, ViewGroup parent) {
        Pessoa obj = lista.get(posicao);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View v = inflater.inflate(R.layout.row_layout, null);

        TextView textNome = (TextView) v.findViewById(R.id.textNome);
        textNome.setText(obj.GetNome());


        TextView textTelefone = (TextView) v.findViewById(R.id.textTelefone);
        textTelefone.setText(obj.GetTelefone());

        TextView textIdade = (TextView) v.findViewById(R.id.textIdade);
        textIdade.setText(String.valueOf(obj.GetIdade()));

        return v;
    }
}
