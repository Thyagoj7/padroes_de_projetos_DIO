package com.projetodiopadroes.projetodiopadroes.service;

import com.projetodiopadroes.projetodiopadroes.model.Cliente;
import com.projetodiopadroes.projetodiopadroes.model.ContaCorrente;

public interface Operacoes {

    void sacar(double valor);

    void depositar(double valor);

    double saldo(double valor);

    void validarConta(ContaCorrente numeroDaConta);



    void validarConta(long numeroDaConta);

    Cliente buscarPorNome(String nome);

    //void trasnferir(double valor, Conta contaDestino);

    void imprimirExtrato();

    Iterable<ContaCorrente> buscarTodos();

    void inserir(ContaCorrente contaCorrente);

    void inserir(Cliente cliente);

    void atualizar(Long id, ContaCorrente contaCorrente);

    void salvarConta(ContaCorrente contaCorrente);

    ContaCorrente validarNumeroConta(Long id);

    //ContaCorrente saque(Long id, double valor, ContaCorrente conta);

    ContaCorrente saque(Long id, double valor);

    ContaCorrente deposito(Long id, double valor);

    ContaCorrente trasnferencia(Long id1, Long id2, double valor);
}
