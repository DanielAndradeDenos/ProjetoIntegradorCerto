package com.example.AulaTeste.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import lombok.Getter;
@Entity

public class SalgadoModel extends ProductModel {
    
    @Column
    @Getter
    private String sabor;

    public SalgadoModel (){}
    public SalgadoModel (String sabor, String nome, String preco, Long id){
        super();
        this.sabor = sabor;

        SalgadoModel salgado1 = new SalgadoModel();


    }
    
}
