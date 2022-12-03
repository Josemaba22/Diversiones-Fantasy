package com.tec.diversionesfantasy.request;

public class DetallePedidoRequest {

	public Long pedido_id;
	public Long mobiliario_id;
	public int cantidad;
	
	public DetallePedidoRequest(Long pedido_id, Long mobiliario_id, int cantidad) {
		super();
		this.pedido_id = pedido_id;
		this.mobiliario_id = mobiliario_id;
		this.cantidad = cantidad;
	}

}
