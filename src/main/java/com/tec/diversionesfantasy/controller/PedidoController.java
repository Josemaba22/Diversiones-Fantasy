package com.tec.diversionesfantasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("get_all_pedidos")
	public List<Pedido> getAllPedidos(){
		return pedidoService.getAllPedidos();
	}
	
	@GetMapping("get_pedidos/{id}")
	public Pedido getPedido(@PathVariable Long id) {
		return pedidoService.getPedidoById(id);
	}
	
	@PostMapping("add_pedido")
	public Pedido addPedido(@RequestBody PedidoRequest request) {
		return pedidoService.addPedido(request);
	}
}
