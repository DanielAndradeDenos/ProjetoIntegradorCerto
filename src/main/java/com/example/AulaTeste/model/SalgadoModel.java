package com.example.AulaTeste.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;

public class SalgadoModel extends ProductModel {

    @Column
    private String sabor;

    public SalgadoModel (){}
    public SalgadoModel (String sabor, Long id, String preco, String nome){
        super();
        this.sabor = sabor;

        SalgadoModel salgado = new SalgadoModel("Frango", 500L, "R$", nome);


    }
    
}
