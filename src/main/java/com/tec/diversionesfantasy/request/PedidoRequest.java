package com.tec.diversionesfantasy.request;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonFormat;


public class PedidoRequest {

	public Long id;
	//public Date fecha_inicio;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	public Date fecha_entrega;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	public Date fecha_recoleccion;
	
	public int direccion_id;
	public int consumidor_id;
	public int transportista_id;
	public int admin_id;
	//public String estatus;
	public String descripcion;
	public String descripcion_daños;
	public Set<DetallePedidoRequest> detalle_pedido = new HashSet<>();
	
}
