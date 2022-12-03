package com.tec.diversionesfantasy.request;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ConsumidorRequest {

	private Long id;
	
	private String nombre;
	
	private String apellido;
	
	private String email;
	
	private String telefono;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	private LocalDate fecha_nacimiento; 
	
	private char sexo;
	
	


	public ConsumidorRequest(Long id, String nombre, String apellido, String email, String telefono,
			LocalDate fecha_nacimiento, char sexo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.fecha_nacimiento = fecha_nacimiento;
		this.sexo = sexo;
	}

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
}
