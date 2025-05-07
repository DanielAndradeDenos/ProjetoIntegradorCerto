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

        public productModel criarProduto(ProducModel productModel) {
        var productExistente = productRepository.findByNome(productModel.getNome());
        if (productExistente != null) {
            throw new ProductJaExiste();
        return productRepository.save(productModel);
        }
    public List<productModel> listarProduto() {
        return productRepository.findAll();
    }
      
    }

    
}

