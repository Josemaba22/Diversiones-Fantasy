package com.tec.diversionesfantasy.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "pedidos")
public class Pedido implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "fecha_creacion")
	private LocalDate fecha_creacion;
	
	@Column(name = "fecha_entrega")
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate fecha_entrega;
	
	@Column(name = "fecha_recoleccion")
	@JsonFormat(pattern="yyyy-MM-dd")
	private LocalDate fecha_recoleccion;
	
	@Column(name = "direccion_id")
	private int direccion_id;
	
	@Column(name = "consumidor_id")
	private int consumidor_id;
	
	@Column(name = "transportista_id")
	private int transportista_id;
	
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
	
	@ManyToOne
	@JoinColumn(name = "direccion_id", insertable = false, updatable = false)
	private Direccion direccion;
	
	@ManyToOne
	@JoinColumn(name = "consumidor_id", insertable = false, updatable = false)
	private Consumidor consumidor;
	
	@ManyToOne
	@JoinColumn(name = "transportista_id", insertable = false, updatable = false)
	private Empleado transportista;
	
	@ManyToOne
	@JoinColumn(name = "admin_id", insertable = false, updatable = false)
	private Empleado administrador;
	
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

	public LocalDate getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(LocalDate fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(LocalDate fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public LocalDate getFecha_recoleccion() {
		return fecha_recoleccion;
	}

	public void setFecha_recoleccion(LocalDate fecha_recoleccion) {
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

	public int getTransportista_id() {
		return transportista_id;
	}

	public void setTransportista_id(int transportista_id) {
		this.transportista_id = transportista_id;
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
