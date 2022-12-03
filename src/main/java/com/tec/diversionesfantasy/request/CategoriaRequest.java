package com.tec.diversionesfantasy.request;

public class CategoriaRequest {

private Long id;
	
	private String nombre;
	
	private String descripcion;
	
	public CategoriaRequest() {}

	public CategoriaRequest(Long id, String nombre, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescription(String descripcion) {
		this.descripcion = descripcion;
	}
}
