package com.example.AulaTeste.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity; // adicionado

import com.example.AulaTeste.errors.UsuarioJaExiste;
import com.example.AulaTeste.model.ProductModel;
import com.example.AulaTeste.repository.IProductRepository;
import com.example.AulaTeste.repository.IUserRepository;

import at.favre.lib.crypto.bcrypt.BCrypt;

public class ProductService {

     
     @Autowired
        private IProductRepository productRepository; {

            String nome = "nome";
            ProductModel productExistente = productRepository.findByNome(nome); {
            throw new Exception();
        }

        return productRepository.save(ProductModel);
    }

    
}

