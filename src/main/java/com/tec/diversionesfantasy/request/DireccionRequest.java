package com.tec.diversionesfantasy.request;

public class DireccionRequest {

	public Long id;
	public String colonia;
	public String calle1;
	public String calle2;
	public int codigo_postal;
	public int numero_interior;
	public int numero_exterior;
	public String descripcion;
	
	public DireccionRequest(Long id, String colonia, String calle1, String calle2, int codigo_postal,
			int numero_interior, int numero_exterior, String descripcion) {
		super();
		this.id = id;
		this.colonia = colonia;
		this.calle1 = calle1;
		this.calle2 = calle2;
		this.codigo_postal = codigo_postal;
		this.numero_interior = numero_interior;
		this.numero_exterior = numero_exterior;
		this.descripcion = descripcion;
	}
	
}
