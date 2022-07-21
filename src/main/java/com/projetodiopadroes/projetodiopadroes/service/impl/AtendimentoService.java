package com.projetodiopadroes.projetodiopadroes.service.impl;

import com.projetodiopadroes.projetodiopadroes.model.AtendimentoCliente;
import com.projetodiopadroes.projetodiopadroes.model.Cliente;
import com.projetodiopadroes.projetodiopadroes.model.ContaCorrente;

public interface AtendimentoService {


    AtendimentoCliente validarNumeroConta(Long id);

    void sacar(double valor);

    void depositar(double valor);

    double saldo(double valor);

    Cliente buscarPorNome(String nome);

    ContaCorrente buscarPorId(Long id);

    //void trasnferir(double valor, Conta contaDestino);

    void imprimirExtrato();

    Iterable<ContaCorrente> buscarTodos();

    void inserir(ContaCorrente contaCorrente);

    void inserir(Cliente cliente);
}
