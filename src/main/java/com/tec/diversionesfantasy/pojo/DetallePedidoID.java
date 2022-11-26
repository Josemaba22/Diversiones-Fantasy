package com.tec.diversionesfantasy.pojo;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;

public class DetallePedidoID implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Column(name = "pedido_id")
	private Long pedido_id;
	
	@Column(name = "mobiliario_id")
	private Long mobiliario_id;
	
	public DetallePedidoID() {}

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
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) 
            return false;

        DetallePedidoID that = (DetallePedidoID) o;
        return Objects.equals(pedido_id, that.pedido_id) && 
               Objects.equals(mobiliario_id, that.mobiliario_id);
    }

    @Override   
    public int hashCode() {
        return Objects.hash(pedido_id, mobiliario_id);
    }

    @Override
    public String toString() {
        return "DetallePedido [pedido_id=" + pedido_id + ", mobiliario_id=" + mobiliario_id + "]";
    }
	
}
