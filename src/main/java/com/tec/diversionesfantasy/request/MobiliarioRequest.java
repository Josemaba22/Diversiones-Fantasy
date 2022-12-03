package com.tec.diversionesfantasy.request;

public class MobiliarioRequest {

	private Long id;
	
	private String nombre;
	
	private double precio_unitario;
	
	private int exitencia;
	
	private String imagen;
	
	private int categoria_id;
	
	public MobiliarioRequest() {}
	
	public MobiliarioRequest(Long id, String nombre, double precio_unitario, int exitencia, String imagen,
			int categoria_id) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio_unitario = precio_unitario;
		this.exitencia = exitencia;
		this.imagen = imagen;
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

	public int getExitencia() {
		return exitencia;
	}

	public void setExitencia(int exitencia) {
		this.exitencia = exitencia;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getCategoria_id() {
		return categoria_id;
	}

	public void setCategoria_id(int categoria_id) {
		this.categoria_id = categoria_id;
	}
	
	
}
