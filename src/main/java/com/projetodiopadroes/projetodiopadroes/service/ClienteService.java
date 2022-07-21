package com.projetodiopadroes.projetodiopadroes.service;

import com.projetodiopadroes.projetodiopadroes.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    Cliente buscarPorNome(String nome);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
