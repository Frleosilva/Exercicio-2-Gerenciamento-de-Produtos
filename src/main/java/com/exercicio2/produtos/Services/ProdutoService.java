package com.exercicio2.produtos.Services;

import com.exercicio2.produtos.Models.ProdutoModel;
import com.exercicio2.produtos.Repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<ProdutoModel> findAll(){
        return produtoRepository.findAll();
    }

    public ProdutoModel criarProduto(ProdutoModel produtoModel){
        return produtoRepository.save(produtoModel);
    }

    public Optional<ProdutoModel> buscarId(Long id){
        return produtoRepository.findById(id);
    }
    public ProdutoModel atualizar(Long id, ProdutoModel produtoModel){
        ProdutoModel newProduto = produtoRepository.findById(id).get();
        newProduto.setNome(produtoModel.getNome());
        newProduto.setPreco(produtoModel.getPreco());
        newProduto.setEstoque(produtoModel.getEstoque());
        return produtoRepository.save(newProduto);
    }

    public void deletar(Long id){
        produtoRepository.deleteById(id);
    }
}
