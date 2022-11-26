package com.tec.diversionesfantasy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.diversionesfantasy.entity.Empleado;
import com.tec.diversionesfantasy.repository.EmpleadoRepository;
import com.tec.diversionesfantasy.request.EmpleadoRequest;

@Service
public class EmpleadoService {

	@Autowired
	EmpleadoRepository empleadoRepository;
	
	public Empleado addEmpleado(EmpleadoRequest request) {
		Empleado empleado = new Empleado();
		empleado.setId(request.id);
		empleado.setNombre(request.nombre);
		empleado.setApellido(request.apellido);
		empleado.setEmail(request.email);
		empleado.setDireccion_id(request.direccion_id);
		empleado.setFecha_nacimiento(request.fecha_nacimiento);
		empleado.setFecha_contratacion(request.fecha_contratacion);
		empleado.setPassword(request.password);
		empleado.setTelefono(request.telefono);
		empleado.setSexo(request.sexo);
		empleado.setRol(request.rol);
		return empleadoRepository.save(empleado);
	}
}
