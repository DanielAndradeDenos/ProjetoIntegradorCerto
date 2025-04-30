package com.example.AulaTeste.model;

import java.util.UUID;

import com.example.AulaTeste.controller.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;

@Data
@Getter
@Entity(name = "product")
public abstract class ProductModel {
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    @Column
    private String Nome;
    @Column
    private Long preco;

    public ProductModel(){}
    public ProductModel(UUID id, String Nome, Long preco){
        this.id = id;
        this.Nome = Nome;
        this.preco = preco;
    }
    public List<ProductModel> findAll() {

        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }
}
