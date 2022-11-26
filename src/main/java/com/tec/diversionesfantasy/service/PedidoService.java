package com.tec.diversionesfantasy.service;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.diversionesfantasy.entity.DetallePedido;
import com.tec.diversionesfantasy.entity.Pedido;
import com.tec.diversionesfantasy.repository.DetallePedidoRepository;
import com.tec.diversionesfantasy.repository.MobiliarioRepository;
import com.tec.diversionesfantasy.repository.PedidoRepository;
import com.tec.diversionesfantasy.request.DetallePedidoRequest;
import com.tec.diversionesfantasy.request.PedidoRequest;


@Service
public class PedidoService {

	@Autowired
	PedidoRepository pedidoRepository;
	
	@Autowired
	MobiliarioRepository mobiliarioRepository;
	
	@Autowired
	DetallePedidoRepository dpRepository;
	
	public Pedido addPedido(PedidoRequest request) {
		Pedido pedido = new Pedido();
		pedido.setId(request.id);
		pedido.setFecha_creacion(new Date());
		pedido.setFecha_entrega(request.fecha_entrega);
		pedido.setFecha_recoleccion(request.fecha_recoleccion);
		pedido.setDireccion_id(request.direccion_id);
		pedido.setTransportista(request.transportista_id);
		pedido.setAdmin_id(request.admin_id);
		pedido.setCnsumidor_id(request.consumidor_id);
		pedido.setEstatus("POR CONFIRMAR");
		pedido.setDescripcion(request.descripcion);
		pedido.setDescripcion_daños(request.descripcion_daños);
		pedidoRepository.save(pedido);

		Set<DetallePedido> detalles = new HashSet<>();
		for(DetallePedidoRequest dp : request.detalle_pedido) {
			DetallePedido detalle = new DetallePedido();
			detalle.setPedido_id(dp.pedido_id);
			detalle.setMobiliario_id(dp.mobiliario_id);
			detalle.setCantidad(dp.cantidad);
			double precio_unitario = mobiliarioRepository.findById(dp.mobiliario_id).get().getPrecio_unitario();
			detalle.setPrecio_unitario(precio_unitario);
			detalles.add(detalle);
		}
		
		dpRepository.saveAll(detalles);
		pedido.setDetalle_pedidos(detalles);
		return pedidoRepository.save(pedido);
		
	}
	
}
