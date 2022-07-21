package com.projetodiopadroes.projetodiopadroes.model;

import javax.persistence.*;

@Entity
public class AtendimentoCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long numeroDoAtendimento;

    @OneToOne
    private ContaCorrente contaCorrente;

    public long getNumeroDoAtendimento() {
        return numeroDoAtendimento;
    }

    public void setNumeroDoAtendimento(long numeroDoAtendimento) {
        this.numeroDoAtendimento = numeroDoAtendimento;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
}
