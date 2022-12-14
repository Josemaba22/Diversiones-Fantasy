package com.tec.diversionesfantasy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.diversionesfantasy.entity.Empleado;
import com.tec.diversionesfantasy.repository.EmpleadoRepository;
import com.tec.diversionesfantasy.request.EmpleadoRequest;

@Service
public class EmpleadoService {

	@Autowired
	EmpleadoRepository empleadoRepository;
	
	public List<Empleado> getAllEmpleados(){
		return empleadoRepository.findAll();
	}
	
	public Empleado getEmpleadoById(Long id) {
		return empleadoRepository.findById(id).get();
	}
	
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
		empleado.setSueldo(request.sueldo);
		return empleadoRepository.save(empleado);
	}
}
