package br.com.estudos.java.models;


public class Conta {
    private int numeroDaConta;
    private String agencia;
    private Cliente cliente;
    private double saldo;

    public Conta(int numeroDaConta, String agencia, Cliente cliente) {
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.cliente = cliente;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }
}
