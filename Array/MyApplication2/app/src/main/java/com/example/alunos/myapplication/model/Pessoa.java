package com.example.alunos.myapplication.model;


public class Pessoa {
    private String nome;
    private String telefone;
    private int idade;

    public Pessoa(String nome, String telefone, int idade) {
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
    }

    public String GetNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String GetTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int GetIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
