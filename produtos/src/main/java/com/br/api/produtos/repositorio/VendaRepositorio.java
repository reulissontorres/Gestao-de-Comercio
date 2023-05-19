package com.br.api.produtos.repositorio;

import org.springframework.data.repository.CrudRepository;
// import org.springframework.stereotype.Repository;

import com.br.api.produtos.modelo.VendaModelo;

// @Repository
public interface VendaRepositorio extends CrudRepository<VendaModelo, Long> {

}
