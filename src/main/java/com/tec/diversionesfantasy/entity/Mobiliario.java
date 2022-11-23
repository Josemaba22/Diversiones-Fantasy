package com.tec.diversionesfantasy.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mobiliarios")
public class Mobiliario {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nombre;
	
	private double precio_unitario;
	
	private int existencia;
	
	private String imagen;
	
	private int categoria_id;
	
	@ManyToOne
	@JoinColumn(name = "categoria_id", insertable = false, updatable = false)
	private Categoria categoria;
	
	public Mobiliario() {}

	public Mobiliario(Long id, String nombre, double precio_unitario, int existencia, String imagen, Categoria categoria_id) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio_unitario = precio_unitario;
		this.existencia = existencia;
		this.imagen = imagen;
		this.categoria = categoria_id;
	}

	
	
	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}

	public int getCategoria_id() {
		return categoria_id;
	}

	public void setCategoria_id(int categoria_id) {
		this.categoria_id = categoria_id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio_unitario() {
		return precio_unitario;
	}

	public void setPrecio_unitario(double precio_unitario) {
		this.precio_unitario = precio_unitario;
	}


	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	
	
	
	
	
	
}
