package com.tec.diversionesfantasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tec.diversionesfantasy.entity.Pedido;
import com.tec.diversionesfantasy.request.PedidoRequest;
import com.tec.diversionesfantasy.service.PedidoService;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {

	@Autowired
	PedidoService pedidoService;
	
	@GetMapping("get_all")
	public List<Pedido> getAllPedidos(){
		return pedidoService.getAllPedidos();
	}
	
	@GetMapping("get/{id}")
	public Pedido getPedido(@PathVariable Long id) {
		return pedidoService.getPedidoById(id);
	}
	
	@PostMapping("add")
	public Pedido addPedido(@RequestBody PedidoRequest request) {
		return pedidoService.addPedido(request);
	}
	
	@PutMapping("entregar/{id}")
	public Pedido entregarPedido(@PathVariable Long id) {
		return pedidoService.entregarPedido(id);
	}
	
	@PutMapping("recoger/{id}")
	public Pedido recogerPedido(@PathVariable Long id) {
		return pedidoService.recogerPedido(id);
	}
	
	/*
	@GetMapping("get/por_recoger")
	public List<Pedido> porRecoger(){
		return pedidoService.porRecoger();
	}*/
	
}
