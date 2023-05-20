package com.br.api.produtos.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.br.api.produtos.modelo.ProdutoModelo;

public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Long> {
    
}
