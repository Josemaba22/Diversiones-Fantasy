package com.tec.diversionesfantasy.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "Empleados")
public class Empleado {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "telefono")
	private String telefono;
	
	@OneToOne
	@JoinColumn(name = "direccion_id", insertable = false, updatable = false)
	private Direccion direccion;
	
	@Column(name = "direccion_id")
	private int direccion_id;
	
	@Column(name = "sueldo")
	private double sueldo;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	@Column(name = "fecha_nacimiento")
	private LocalDate fecha_nacimiento;
	
	@JsonFormat(pattern="dd-MM-yyyy")
	@Column(name = "fecha_contratacion")
	private LocalDate fecha_contratacion;
	
	@Column(name = "sexo")
	private char sexo;
	
	@Column(name = "rol")
	private String rol;
	
	@JsonIgnore
	@OneToMany
	@JoinColumn(name = "transportista")
	private Set<Pedido> pedidosTransportista = new HashSet<>();
	
	@JsonIgnore
	@OneToMany
	@JoinColumn(name = "administrador")
	private Set<Pedido> pedidosAdmin = new HashSet<>();
	

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public int getDireccion_id() {
		return direccion_id;
	}

	public void setDireccion_id(int direccion_id) {
		this.direccion_id = direccion_id;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public LocalDate getFecha_contratacion() {
		return fecha_contratacion;
	}

	public void setFecha_contratacion(LocalDate fecha_contratacion) {
		this.fecha_contratacion = fecha_contratacion;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	
	
	
}
