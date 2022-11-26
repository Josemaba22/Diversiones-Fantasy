package com.tec.diversionesfantasy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tec.diversionesfantasy.entity.Pedido;
import com.tec.diversionesfantasy.request.PedidoRequest;
import com.tec.diversionesfantasy.service.PedidoService;

@RestController
public class PedidoController {

	@Autowired
	PedidoService pedidoService;
	
	@PostMapping("add_pedido")
	public Pedido addPedido(@RequestBody PedidoRequest request) {
		return pedidoService.addPedido(request);
	}
}
