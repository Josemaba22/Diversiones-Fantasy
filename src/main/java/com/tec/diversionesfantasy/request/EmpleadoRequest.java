package com.tec.diversionesfantasy.request;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EmpleadoRequest {

	public Long id;
	
	public String nombre;
	
	public String apellido;
	
	public String email;
	
	public String password;
	
	public String telefono;
	
	public int direccion_id;
	
	public double sueldo;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	public Date fecha_nacimiento;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	public Date fecha_contratacion;
	
	public char sexo;
	
	public String rol;

}
