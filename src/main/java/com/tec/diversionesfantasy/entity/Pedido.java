package com.tec.diversionesfantasy.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "pedidos")
public class Pedido implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "fecha_inicio")
	private Date fecha_inicio;
	
	@Column(name = "fecha_entrega")
	private Date fecha_entrega;
	
	@Column(name = "fecha_recoleccion")
	private Date fecha_recoleccion;
	
	@Column(name = "direccion_id")
	private int direccion_id;
	
	@Column(name = "consumidor_id")
	private int consumidor_id;
	
	@Column(name = "transportista_id")
	private int transportista;
	
	@Column(name = "admin_id")
	private int admin_id;
	
	@Column(name = "estatus")
	private String estatus;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "descripcion_daños")
	private String descripcion_daños;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "pedido")  
    private Set<DetallePedido> detalle_pedidos = new HashSet<>();
	
	
	
	public int getConsumidor_id() {
		return consumidor_id;
	}

	public void setConsumidor_id(int consumidor_id) {
		this.consumidor_id = consumidor_id;
	}

	public Set<DetallePedido> getDetalle_pedidos() {
		return detalle_pedidos;
	}

	public void setDetalle_pedidos(Set<DetallePedido> detalle_pedidos) {
		this.detalle_pedidos = detalle_pedidos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public Date getFecha_recoleccion() {
		return fecha_recoleccion;
	}

	public void setFecha_recoleccion(Date fecha_recoleccion) {
		this.fecha_recoleccion = fecha_recoleccion;
	}

	public int getDireccion_id() {
		return direccion_id;
	}

	public void setDireccion_id(int direccion_id) {
		this.direccion_id = direccion_id;
	}

	public int getCnsumidor_id() {
		return consumidor_id;
	}

	public void setCnsumidor_id(int consumidor_id) {
		this.consumidor_id = consumidor_id;
	}

	public int getTransportista() {
		return transportista;
	}

	public void setTransportista(int transportista) {
		this.transportista = transportista;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion_daños() {
		return descripcion_daños;
	}

	public void setDescripcion_daños(String descripcion_daños) {
		this.descripcion_daños = descripcion_daños;
	}
	
	
	
}
