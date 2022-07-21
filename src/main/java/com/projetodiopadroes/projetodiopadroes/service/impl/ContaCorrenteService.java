package com.projetodiopadroes.projetodiopadroes.service.impl;

import com.projetodiopadroes.projetodiopadroes.model.*;
import com.projetodiopadroes.projetodiopadroes.service.ClienteService;
import com.projetodiopadroes.projetodiopadroes.service.Operacoes;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContaCorrenteService implements Operacoes {

    @Autowired
    private ContaRepository contaRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteService clienteService;



    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public double saldo(double valor) {
        return valor;
    }

    @Override
    public void validarConta(ContaCorrente numeroDaConta) {

    }


    @Override
    public void validarConta(long numeroDaConta) {

    }

    @Override
    public Cliente buscarPorNome(String nome) {
        return null;
    }

    @Override
    public void imprimirExtrato() {

    }

    @Override
    public Iterable<ContaCorrente> buscarTodos() {
        // Buscar todos os Clientes.
        return contaRepository.findAll();
    }

    @Override
    public void inserir(ContaCorrente conta) {
            salvarConta(conta);

    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, ContaCorrente contaCorrente) {

    }


    public void salvarConta(@NotNull ContaCorrente contaCorrente) {
        //verificar se o cliente esta cadastrado no sistema
        Cliente novoCliente = contaCorrente.getCliente();
        String nome = contaCorrente.getCliente().getNome();
        Cliente cliente = clienteRepository.findByNome(nome).orElseGet(() -> {
            //Caso o nome não exista
            clienteService.inserir(novoCliente);

        return novoCliente;
        });
        contaCorrente.setCliente(cliente);
        contaRepository.save(contaCorrente);
//
    }

    @Override
    public ContaCorrente validarNumeroConta(Long id) {
        // Buscar Cliente por ID.
        Optional<ContaCorrente> contaCorrente = contaRepository.findById(id);
        if(contaCorrente.isEmpty()) {
            contaCorrente.get().setNumeroDaConta(0);
        }

        System.out.println(contaCorrente.get());
        return contaCorrente.get();
    }



    @Override
    public ContaCorrente saque(Long id, double valor){
        //ContaCorrente conta;
        Optional<ContaCorrente> contaCorrente = contaRepository.findById(id);
        double retirada = contaCorrente.get().getSaldo();
        double retirada2 = retirada - valor;
        contaCorrente.get().setSaldo(retirada2);
        contaRepository.save(contaCorrente.get());

        return  contaCorrente.get();

    }

    @Override
    public ContaCorrente deposito(Long id, double valor){
        Optional<ContaCorrente> contaCorrente = contaRepository.findById(id);
        double depositoop1 = contaCorrente.get().getSaldo();
        double depositoop2 = depositoop1 + valor;
        contaCorrente.get().setSaldo(depositoop2);
        contaRepository.save(contaCorrente.get());

        return contaCorrente.get();
    }

    @Override
    public ContaCorrente trasnferencia(Long id1, Long id2, double valor){
        Optional<ContaCorrente> contaCorrente = contaRepository.findById(id1);
        Optional<ContaCorrente> contaCorrente2 = contaRepository.findById(id2);
        double saida = contaCorrente.get().getSaldo();
        double pegaSaida = saida -valor;
        double valorPegasaida;
        double entradaPronta;
        double entrada = contaCorrente2.get().getSaldo();
        if(pegaSaida > 0 ) {

            entradaPronta = entrada + valor;
            valorPegasaida = pegaSaida;
        }else{
            entradaPronta = contaCorrente2.get().getSaldo();
            valorPegasaida = saida;
        }

        contaCorrente2.get().setSaldo(entradaPronta);
        contaRepository.save(contaCorrente2.get());
        contaCorrente.get().setSaldo(valorPegasaida);
        contaRepository.save(contaCorrente.get());

        return contaCorrente.get();




    }



}
