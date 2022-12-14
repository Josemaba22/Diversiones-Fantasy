package com.tec.diversionesfantasy.service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.diversionesfantasy.entity.DetallePedido;
import com.tec.diversionesfantasy.entity.Empleado;
import com.tec.diversionesfantasy.entity.Pedido;
import com.tec.diversionesfantasy.repository.ConsumidorRepository;
import com.tec.diversionesfantasy.repository.DetallePedidoRepository;
import com.tec.diversionesfantasy.repository.DireccionRepository;
import com.tec.diversionesfantasy.repository.EmpleadoRepository;
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
	
	@Autowired
	EmpleadoRepository empleadoRepository;
	
	@Autowired
	ConsumidorRepository consumidorRepository;
	
	@Autowired
	DireccionRepository direccionRepository;
	
	public List<Pedido> getAllPedidos(){
		return pedidoRepository.findAll();
	}
	
	public Pedido getPedidoById(Long id) {
		return pedidoRepository.findById(id).get();
	}
	
	public Pedido entregarPedido(Long id) {
		Pedido pedido = pedidoRepository.findById(id).get();
		pedido.setEstatus("POR RECOGER");
		return pedidoRepository.save(pedido);
	}
	
	public Pedido recogerPedido(Long id) {
		Pedido pedido = pedidoRepository.findById(id).get();
		pedido.setEstatus("FINALIZADO");
		return pedidoRepository.save(pedido);
	}
	
	/*
	public List<Pedido> porRecoger(){
		return pedidoRepository.porRecoger();
	}
	*/
	
	public Pedido addPedido(PedidoRequest request) {
		Pedido pedido = new Pedido();
		pedido.setId(request.id);
		pedido.setFecha_creacion(LocalDate.now());
		pedido.setFecha_entrega(request.fecha_entrega);
		pedido.setFecha_recoleccion(request.fecha_recoleccion);
		pedido.setDireccion_id(request.direccion_id);
		pedido.setTransportista_id(request.transportista_id);
		pedido.setAdmin_id(request.admin_id);
		pedido.setCnsumidor_id(request.consumidor_id);
		pedido.setEstatus("POR ENTREGAR");
		pedido.setDescripcion(request.descripcion);
		pedido.setDescripcion_da??os(request.descripcion_da??os);
		pedido.setAdministrador(empleadoRepository.findById(request.admin_id));
		pedido.setConsumidor(consumidorRepository.findById(request.consumidor_id));
		pedido.setDireccion(direccionRepository.findById(request.direccion_id));
		pedido.setTransportista(empleadoRepository.findById(request.transportista_id));
		pedidoRepository.save(pedido);

		Set<DetallePedido> detalles = new HashSet<>();
		for(DetallePedidoRequest dp : request.detalle_pedido) {
			DetallePedido detalle = new DetallePedido();
			detalle.setPedido_id(dp.pedido_id);
			detalle.setMobiliario_id(dp.mobiliario_id);
			detalle.setNombre_mobiliario(mobiliarioRepository.findById(dp.mobiliario_id).get().getNombre());
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
