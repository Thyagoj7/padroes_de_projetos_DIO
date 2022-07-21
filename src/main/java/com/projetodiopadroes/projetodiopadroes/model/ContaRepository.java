package com.projetodiopadroes.projetodiopadroes.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ContaRepository extends CrudRepository<ContaCorrente, Long> {
    //Optional<Cliente> findByNome(String nome);
}
