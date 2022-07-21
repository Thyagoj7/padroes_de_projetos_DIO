package com.projetodiopadroes.projetodiopadroes.controller;

import com.projetodiopadroes.projetodiopadroes.model.AtendimentoCliente;
import com.projetodiopadroes.projetodiopadroes.model.ContaCorrente;

import com.projetodiopadroes.projetodiopadroes.service.Operacoes;
import com.projetodiopadroes.projetodiopadroes.service.impl.AtendimentoClienteService;
import com.projetodiopadroes.projetodiopadroes.service.impl.AtendimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Atendimento")
public class AtendimentoClienteController {
    @Autowired
    private AtendimentoService atendimentoClienteService;




    @GetMapping("/{id}")
    public ResponseEntity<AtendimentoCliente> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(atendimentoClienteService.validarNumeroConta(id));
    }

}
