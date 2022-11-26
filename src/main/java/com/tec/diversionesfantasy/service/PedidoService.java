package com.tec.diversionesfantasy.service;

import java.util.Date;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.diversionesfantasy.entity.DetallePedido;
import com.tec.diversionesfantasy.entity.Pedido;
import com.tec.diversionesfantasy.repository.PedidoRepository;
import com.tec.diversionesfantasy.request.PedidoRequest;


@Service
public class PedidoService {

	@Autowired
	PedidoRepository pedidoRepository;
	
	public Pedido addPedido(PedidoRequest request) {
		Pedido pedido = new Pedido();
		pedido.setId(request.id);
		pedido.setFecha_inicio(new Date());
		pedido.setFecha_entrega(request.fecha_entrega);
		pedido.setFecha_recoleccion(request.fecha_recoleccion);
		pedido.setDireccion_id(request.direccion_id);
		pedido.setTransportista(request.transportista_id);
		pedido.setAdmin_id(request.admin_id);
		pedido.setCnsumidor_id(request.consumidor_id);
		pedido.setEstatus("POR CONFIRMAR");
		pedido.setDescripcion(request.descripcion);
		pedido.setDescripcion_daños(request.descripcion_daños);
		/*
		pedido.setDetalle_pedidos(request.detalle_pedido
				.stream()
				.map(detallepedido -> {
					DetallePedido dpedido = detallepedido;
					if(dpedido.ge > 0) {
						ccontents = courseContentsRepository.findById(ccontents.getId());
					}
					ccontents.addCourse(course);
					return ccontents;
				})
			.collect(Collectors.toSet()));
			*/
		return pedidoRepository.save(pedido);
		
	}
	
}
