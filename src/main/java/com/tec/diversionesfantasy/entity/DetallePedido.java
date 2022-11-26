package com.tec.diversionesfantasy.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.tec.diversionesfantasy.pojo.DetallePedidoID;

@Entity
@Table(name = "detalle_pedidos")
@IdClass(DetallePedidoID.class)
public class DetallePedido {
	
	@Id
	private Long pedido_id;
	
	@Id
	private Long mobiliario_id;
	
	private int cantidad;
	private double precio_unitario;

	@ManyToOne
    @JoinColumn(name = "pedido_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Pedido pedido;
	
	@ManyToOne
    @JoinColumn(name = "mobiliario_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Mobiliario mobiliario;
	
	public DetallePedido() {}

	public DetallePedido(Long pedido_id, Long mobiliario_id, int cantidad, double precio_unitario) {
		this.pedido_id = pedido_id;
		this.mobiliario_id = mobiliario_id;
		this.cantidad = cantidad;
		this.precio_unitario = precio_unitario;
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

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio_unitario() {
		return precio_unitario;
	}

	public void setPrecio_unitario(double precio_unitario) {
		this.precio_unitario = precio_unitario;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Mobiliario getMobiliario() {
		return mobiliario;
	}

	public void setMobiliario(Mobiliario mobiliario) {
		this.mobiliario = mobiliario;
	}
	
	
}
