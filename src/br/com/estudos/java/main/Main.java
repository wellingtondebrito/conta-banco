package br.com.estudos.java.main;

import java.util.Scanner;
import br.com.estudos.java.models.Conta;
import br.com.estudos.java.models.Cliente;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta");
        int numero = (int) entrada.nextInt();

        System.out.println("Por favor, digite a agencia");
        String agencia = entrada.nextLine();

        System.out.println("Por favor, digite o seu nome");
        String nome = entrada.nextLine();

        System.out.println("Por favor, digite o seu sobrenome");
        String sobreNome = entrada.nextLine();

        System.out.println("Por favor, digite o cpf");
        String cpf = entrada.nextLine();

        Cliente cliente = new Cliente(nome, cpf, sobreNome);
        Conta contaCorrente = new Conta(numero, agencia, cliente);

        System.out.println("Olá " + cliente.getNome() + " " + cliente.getSobrenome() + "obrigado por criar uma conta em nosso banco, sua agência é "+ contaCorrente.getAgencia() + " e o número da sua conta é " + contaCorrente.getNumeroDaConta());
    }
}
