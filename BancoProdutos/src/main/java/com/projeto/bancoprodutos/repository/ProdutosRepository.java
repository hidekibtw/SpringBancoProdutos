package com.projeto.bancoprodutos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.bancoprodutos.models.Produtos;

public interface ProdutosRepository extends JpaRepository <Produtos, Integer> {

}
