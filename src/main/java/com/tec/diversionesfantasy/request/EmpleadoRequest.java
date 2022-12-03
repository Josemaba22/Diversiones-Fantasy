package com.tec.diversionesfantasy.request;

import java.time.LocalDate;

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
	
	@JsonFormat(pattern="yyyy-MM-dd")
	public LocalDate fecha_nacimiento;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	public LocalDate fecha_contratacion;

	public char sexo;
	public String rol;
	
	public EmpleadoRequest(Long id, String nombre, String apellido, String email, String password, String telefono,
			int direccion_id, double sueldo, LocalDate fecha_nacimiento, LocalDate fecha_contratacion, char sexo,
			String rol) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.telefono = telefono;
		this.direccion_id = direccion_id;
		this.sueldo = sueldo;
		this.fecha_nacimiento = fecha_nacimiento;
		this.fecha_contratacion = fecha_contratacion;
		this.sexo = sexo;
		this.rol = rol;
	}
	
}
