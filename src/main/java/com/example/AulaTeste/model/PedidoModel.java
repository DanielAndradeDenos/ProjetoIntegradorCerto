package com.example.AulaTeste.model;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

public class PedidoModel {
    
    @Column
    private String endereco;

    @Column
    private String nome;

    @Column 
    private String quantidade;

    @Column
    private String produto;

    @Column
    private String preco;

    @Id
    @GeneratedValue(generator = "UUID")
    @Column
    private UUID id;

    public PedidoModel(){}
    public PedidoModel(String endereco, String nome, String quantidade, String produto, String preco, UUID id){

this.endereco = endereco;
this.nome = nome;
this.quantidade = quantidade;
this.produto = produto;
this.preco = preco;
this.id = id;

    }
}
