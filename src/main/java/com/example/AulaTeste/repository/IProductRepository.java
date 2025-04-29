package com.example.AulaTeste.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

import com.example.AulaTeste.model.ProductModel;

public interface IProductRepository extends JpaRepository<ProductModel, UUID>{
    ProductModel findByNome(String nome);
}