package com.projetodiopadroes.projetodiopadroes.controller;

import com.projetodiopadroes.projetodiopadroes.model.ContaCorrente;
import com.projetodiopadroes.projetodiopadroes.service.ClienteService;
import com.projetodiopadroes.projetodiopadroes.service.impl.ContaCorrenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Conta")
public class ContaController {

    @Autowired(required = true)
    ContaCorrenteService correnteService;



    @GetMapping
    public ResponseEntity<Iterable<ContaCorrente>> buscarTodos() {
        return ResponseEntity.ok(correnteService.buscarTodos());
    }

    @PostMapping
    public ResponseEntity<ContaCorrente> inserir(@RequestBody ContaCorrente contaCorrente) {
        correnteService.inserir(contaCorrente);
        return ResponseEntity.ok(contaCorrente);
    }



    @GetMapping("/{id}")
    public ResponseEntity<ContaCorrente> acessarConta(@PathVariable Long id) {
        return ResponseEntity.ok(correnteService.validarNumeroConta(id));
    }

    @GetMapping("/{id}/saque")
    public ResponseEntity<ContaCorrente> atualizar(@PathVariable Long id, double valor) {
           return ResponseEntity.ok(correnteService.saque(id, valor));

    }

    @GetMapping("/{id}/{deposito}/{depositando}")
    public ResponseEntity<ContaCorrente> depositar(@PathVariable Long id, double valor) {
        return ResponseEntity.ok(correnteService.deposito(id, valor));
    }

    @GetMapping("/{id1}/{id}/trasferencia")
    public ResponseEntity<ContaCorrente>transferir(@PathVariable Long id1, Long id2, double valor) {
        return ResponseEntity.ok(correnteService.trasnferencia(id1, id2, valor));
    }

}
