package com.example.AulaTeste.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AulaTeste.repository.IProductRepository;

@RestController
@RequestMapping 
("/products")
public class ProductController {

  private static final Object ListProduct = null;

  @Autowired
  IProductRepository repository;

  
@SuppressWarnings("rawtypes")// adicionado
@GetMapping
public ResponseEntity getAll(){
    return ResponseEntity.status(HttpStatus.OK).body(ListProduct); 
}

    
}
