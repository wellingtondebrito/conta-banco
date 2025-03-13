package br.com.estudos.java.main;

import java.util.Scanner;
import br.com.estudos.java.models.Conta;
import br.com.estudos.java.models.Cliente;
import br.com.estudos.java.repositories.ContaRepository;

public class Main {
    public static void main(String[] args) {
        ContaRepository contas = new ContaRepository();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Olá bem-vindo ao TechBank! Escolha uma opção para iniciar:");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Acessar conta");
        System.out.println("3 - Sair");

        int opcao = entrada.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Digite seu nome:");
                String nome = entrada.nextLine();
                System.out.println("Digite seu sobrenome:");
                String sobrenome = entrada.nextLine();
                System.out.println("Digite seu CPF:");
                String cpf = entrada.nextLine();
                System.out.println("Digite sua senha:");
                int senha = entrada.nextInt();

                Cliente cliente = new Cliente(nome, cpf, sobrenome, senha);
                Conta conta = new Conta(cliente);
                contas.salvar(conta);
                System.out.println("Conta criada com sucesso! Seu número de conta é: " + conta.getNumeroDaConta());
                break;
                case 2:
                    System.out.println("Digite o número da conta:");
                    int numeroDaConta = entrada.nextInt();
                    Conta contaAcessada = contas.buscar(numeroDaConta);
                    if (contaAcessada != null) {
                        System.out.println("Digite sua senha:");
                        int senhaDigitada = entrada.nextInt();
                        if (contaAcessada.getCliente().getSenha() == senhaDigitada) {
                            System.out.println("Acesso permitido!");
                            System.out.println("Digite 1 para ver o saldo");
                            System.out.println("Digite 2 para fazer um depósito");
                            System.out.println("Digite 3 para sacar");
                            System.out.println("Digite 4 para transferir");
                            System.out.println("Digite 5 para sair");
                            int opcaoMenu = entrada.nextInt();
                            switch(opcaoMenu){
                                case 1:
                                    System.out.println("Seu saldo é: " + contaAcessada.getSaldo());
                                    break;
                                case 2:
                                    System.out.println("Digite o valor do depósito:");
                                    double valorDeposito = entrada.nextDouble();
                                    contaAcessada.depositar(valorDeposito);
                                    System.out.println("Depósito realizado com sucesso!");
                                    break;
                                case 3:
                                    System.out.println("Digite o valor do saque:");
                                    double valorSaque = entrada.nextDouble();
                                    contaAcessada.sacar(valorSaque);
                                    System.out.println("Saque realizado com sucesso!");
                                    break;
                                case 4:
                                    System.out.println("Digite o número da conta de destino:");
                                    int numeroDaContaDestino = entrada.nextInt();
                                    Conta contaDestino = contas.buscar(numeroDaContaDestino);
                                    if (contaDestino != null) {
                                        System.out.println("Digite o valor da transferência:");
                                        double valorTransferencia = entrada.nextDouble();
                                        contaAcessada.transferir(valorTransferencia, contaDestino);
                                        System.out.println("Transferência realizada com sucesso!");
                                    } else {
                                        System.out.println("Conta de destino não encontrada");
                                    }
                                    break;
                                case 5:
                                    System.out.println("Saindo...");
                                    System.out.println("Obrigado por utilizar o TechBank!");
                                    break;
                            }
                            }
                        }


        }

    }
}
