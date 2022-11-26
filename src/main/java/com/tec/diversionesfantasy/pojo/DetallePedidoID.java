package com.tec.diversionesfantasy.pojo;

import java.io.Serializable;

import javax.persistence.Column;

public class DetallePedidoID implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "pedido_id")
	private Long pedido_id;
	
	@Column(name = "mobiliario_id")
	private Long mobiliario_id;

	public DetallePedidoID(Long pedido_id, Long mobiliario_id) {
		super();
		this.pedido_id = pedido_id;
		this.mobiliario_id = mobiliario_id;
	}

	public Long getPedido_id() {
		return pedido_id;
	}

	public void setPedido_id(Long pedido_id) {
		this.pedido_id = pedido_id;
	}

	public Long getMobiliario_id() {
		return mobiliario_id;
	}

	public void setMobiliario_id(Long mobiliario_id) {
		this.mobiliario_id = mobiliario_id;
	}
	
	
	
}
