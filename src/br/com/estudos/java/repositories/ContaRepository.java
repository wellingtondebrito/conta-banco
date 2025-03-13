package br.com.estudos.java.repositories;

import br.com.estudos.java.models.Conta;

import java.util.ArrayList;
import java.util.List;

public class ContaRepository {
    private static final List<Conta> CONTAS = new ArrayList<>();


    public void salvar(Conta conta) {
        conta.setNumeroDaConta(CONTAS.size() + 1);
        CONTAS.add(conta);
    }

    public Conta buscar(int numeroDaConta) {
        for (Conta conta : CONTAS) {
            if (conta.getNumeroDaConta() == numeroDaConta) {
                return conta;
            }
        }
        return null;
    }
}
