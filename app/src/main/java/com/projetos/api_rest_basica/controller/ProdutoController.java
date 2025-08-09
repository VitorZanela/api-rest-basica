package com.projetos.api_rest_basica.controller;

import com.projetos.api_rest_basica.model.Produto;
import com.projetos.api_rest_basica.service.ProdutoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public List<Produto> listarProduto(){
        return produtoService.listarProduto();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> consultarProduto(@PathVariable Long id){
        return produtoService.buscarProduto(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Produto criarProduto(Produto produto){
        return produtoService.criarProduto(produto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarProduto(@PathVariable Long id){
        produtoService.deletarProduto(id);
        return ResponseEntity.noContent().build();
    }

}
