package com.projetodiopadroes.projetodiopadroes.service.impl;

import com.projetodiopadroes.projetodiopadroes.model.*;
import com.projetodiopadroes.projetodiopadroes.model.ContaCorrente;
import com.projetodiopadroes.projetodiopadroes.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AtendimentoClienteService implements AtendimentoService {

    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    ClienteService clienteService;

    @Autowired
    ContaRepository contaRepository;

    @Autowired(required = false)
    ContaCorrente contaCorrente;

    @Autowired(required = false)
    AtendimentoCliente atendimentoCliente;

    @Autowired
    AtendimentoClienteRepository atendimentoClienteRepository;



    @Override
    public Cliente buscarPorNome(String nome) {
        //Buscar cliente por nome.
        Optional<Cliente> cliente = clienteRepository.findByNome(nome);
        return cliente.get();
    }

    @Override
    public ContaCorrente buscarPorId(Long id) {
        return null;
    }


    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public double saldo(double valor) {
        return contaCorrente.getSaldo();
    }

//    @Override
//    public void validarConta(ContaCorrente numeroDaConta) {
//
//    }

//    @Override
//    public Void validarConta(ContaCorrente numeroDaConta) {
//        long num = numeroDaConta.getNumeroDaConta();
//        ContaCorrente numDaConta = contaRepository.findById(num).orElseGet(() -> {
//
//                }
//
//        );
//
//    }


    @Override
    public AtendimentoCliente validarNumeroConta(Long id) {
        // Buscar Cliente por ID.
        Optional<AtendimentoCliente> atendimentoCliente = atendimentoClienteRepository.findById(id);
//        if(contaCorrente == null){
//            contaCorrente.get().setNumeroDaConta(0);
//        }else{
//            contaCorrente.get().getNumeroDaConta();
//        }

        //return contaCorrente..getNumeroDaConta();

        System.out.println(atendimentoCliente.get());
        return atendimentoCliente.get();
    }


//    @Override
//    public void validarConta(long numeroDaConta) {
//
//    }

//    @Override
//    public void validarConta(ContaCorrente numeroDaConta) {
//        ContaCorrente conta = numeroDaConta.getNumeroDaConta();
//        return null;
//    }

    @Override
    public void imprimirExtrato() {

    }

    @Override
    public Iterable<ContaCorrente> buscarTodos() {
        return null;
    }

    @Override
    public void inserir(ContaCorrente contaCorrente) {

    }

    @Override
    public void inserir(Cliente cliente) {

    }
}
