package com.tec.diversionesfantasy.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Direcciones")
public class Direccion {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "colonia")
	private String colonia;
	
	@Column(name = "calle1")
	private String calle1;
	
	@Column(name = "calle2")
	private String calle2;
	
	@Column(name = "numero_interior")
	private int numero_interior;
	
	@Column(name = "numero_exterior")
	private int numero_exterior;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	
	public Direccion() {}

	public Direccion(Long id, String colonia, String calle1, String calle2, int numero_interior, int numero_exterior,
			String descripcion) {
		super();
		this.id = id;
		this.colonia = colonia;
		this.calle1 = calle1;
		this.calle2 = calle2;
		this.numero_interior = numero_interior;
		this.numero_exterior = numero_exterior;
		this.descripcion = descripcion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCalle1() {
		return calle1;
	}

	public void setCalle1(String calle1) {
		this.calle1 = calle1;
	}

	public String getCalle2() {
		return calle2;
	}

	public void setCalle2(String calle2) {
		this.calle2 = calle2;
	}

	public int getNumero_interior() {
		return numero_interior;
	}

	public void setNumero_interior(int numero_interior) {
		this.numero_interior = numero_interior;
	}

	public int getNumero_exterior() {
		return numero_exterior;
	}

	public void setNumero_exterior(int numero_exterior) {
		this.numero_exterior = numero_exterior;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
