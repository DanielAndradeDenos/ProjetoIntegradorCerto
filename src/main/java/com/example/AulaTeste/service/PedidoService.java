package com.example.AulaTeste.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AulaTeste.model.PedidoModel;
import com.example.AulaTeste.repository.IPedidoRepository;

@Service
public class PedidoService {
    @Autowired
    private IPedidoRepository pedidoRepository;
    
    public PedidoModel criarPedido(PedidoModel pedido) {
        return pedidoRepository.save(pedido);
    }


}
