package com.exercicio2.produtos.Repositories;

import com.exercicio2.produtos.Models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
