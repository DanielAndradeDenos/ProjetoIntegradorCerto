package com.example.AulaTeste.service;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.AulaTeste.errors.UsuarioJaExiste;
import com.example.AulaTeste.model.ProductModel;

import com.example.AulaTeste.repository.IProductRepository;
import java.util.List;



@Service
public class ProductService {
    @Autowired
    private IProductRepository productRepository;


    public ProductModel criarProduto(ProductModel productModel) {
        var productExistente = productRepository.findByNome(productModel.getNome());
        if (productExistente != null) {
            throw new UsuarioJaExiste();
        }
        return productRepository.save(productModel);
    }

    public List<ProductModel> listarProduto() {
        return productRepository.findAll();
    }

    public ProductModel buscarPorNome(String nome) {
        return productRepository.findByNome(nome);
    }

    public ProductModel buscarPorId(String id) {
        return productRepository.findById(id);
    }

}