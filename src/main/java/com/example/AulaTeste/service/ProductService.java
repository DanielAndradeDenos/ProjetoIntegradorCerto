package com.example.AulaTeste.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.AulaTeste.errors.UsuarioJaExiste;
import com.example.AulaTeste.model.ProductModel;
import com.example.AulaTeste.repository.IProductRepository;
import com.example.AulaTeste.repository.IUserRepository;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class ProductService {

     @Autowired
    private IProductRepository productRepository;

        public ProductModel criarProduto(ProducModel productModel) {
        var productExistente = productRepository.findByNome(ProductModel.getNome());
        if (productExistente != null) {
            throw new ProductJaExiste();
        return productRepository.save(ProductModel);
        }
    public List<ProductModel> listarProduto() {
        return productRepository.findAll();
    }
          public ProductModel buscarPorNome(String Nome) {
        return productRepository.findByNome(Nome);
    }
    public ProductModel buscarPorId(String id) {
        return productRepository.findById(id);
    }
    }

    
}

