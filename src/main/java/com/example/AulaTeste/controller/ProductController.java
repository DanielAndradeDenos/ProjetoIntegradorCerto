package com.example.AulaTeste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.example.AulaTeste.model.ProductModel;

@RestController
@RequestMapping 
("/products")
public class ProductController {

  private static final Object ListProduct = null;

  @Autowired
  ProductModel Repository repository;

  
@GetMapping
public ResponseEntity getAll(){
    List<ProductModel>listProducts = repository.findAll(); //Erro na Lista e na declaração do repositorio
    return ResponseEntity.status(HttpStatus.OK).body(ListProduct); 
}

    
}
