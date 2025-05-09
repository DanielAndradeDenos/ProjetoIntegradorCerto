package com.example.AulaTeste.model;

import java.util.UUID;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
    private String nome;
    @Column
    private Long preco;

    public ProductModel(){}
    public ProductModel(UUID id, String nome, Long preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    public List<ProductModel> findAll() {

        throw new UnsupportedOperationException("Erro");
    }
}
