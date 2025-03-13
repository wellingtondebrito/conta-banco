package br.com.estudos.java.models;

public class Cliente {
    private String nome;
    private String cpf;
    private String sobrenome;
    private int senha;

    public Cliente (String nome, String cpf, String sobrenome, int senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.sobrenome = sobrenome;
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getSenha() {
        return senha;
    }
}
