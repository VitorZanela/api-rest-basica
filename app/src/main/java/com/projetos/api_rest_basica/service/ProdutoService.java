package com.projetos.api_rest_basica.service;

import com.projetos.api_rest_basica.model.Produto;
import com.projetos.api_rest_basica.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public List<Produto> listarProduto(){
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarProduto(Long id){
        return produtoRepository.findById(id);
    }

    public Produto criarProduto(Produto produto){
        return produtoRepository.save(produto);
    }

    public void deletarProduto(Long id){
        produtoRepository.deleteById(id);
    }

}
