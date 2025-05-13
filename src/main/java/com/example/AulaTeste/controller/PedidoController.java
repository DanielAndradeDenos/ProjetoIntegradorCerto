package com.example.AulaTeste.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.example.AulaTeste.model.PedidoModel;
import com.example.AulaTeste.service.PedidoService;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping("/")
    public ResponseEntity<?> criarPedido(@RequestBody PedidoModel pedidoModel) {
            var pedido = pedidoService.criarPedido(pedidoModel); 
            return ResponseEntity.status(HttpStatus.CREATED).body(pedido);
    }
}
