package com.tec.diversionesfantasy.request;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;


public class PedidoRequest {

	public Long id;
	//public Date fecha_inicio;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	public LocalDate fecha_entrega;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	public LocalDate fecha_recoleccion;
	
	public int direccion_id;
	public int consumidor_id;
	public int transportista_id;
	public int admin_id;
	//public String estatus;
	public String descripcion;
	public String descripcion_daños;
	
	public Set<DetallePedidoRequest> detalle_pedido = new HashSet<>();
	public PedidoRequest(Long id, LocalDate fecha_entrega, LocalDate fecha_recoleccion, int direccion_id,
			int consumidor_id, int transportista_id, int admin_id, String descripcion, String descripcion_daños) {
		super();
		this.id = id;
		this.fecha_entrega = fecha_entrega;
		this.fecha_recoleccion = fecha_recoleccion;
		this.direccion_id = direccion_id;
		this.consumidor_id = consumidor_id;
		this.transportista_id = transportista_id;
		this.admin_id = admin_id;
		this.descripcion = descripcion;
		this.descripcion_daños = descripcion_daños;
	}
	
	
	
}
