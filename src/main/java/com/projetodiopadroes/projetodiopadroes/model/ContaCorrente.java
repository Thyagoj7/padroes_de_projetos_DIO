package com.projetodiopadroes.projetodiopadroes.model;

import javax.persistence.*;

@Entity
public class ContaCorrente extends Conta{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long numeroDaConta;

    public long getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(long numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    @OneToOne
    private Cliente cliente;

    private double saldo;



    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



}
