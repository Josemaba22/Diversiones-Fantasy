package com.tec.diversionesfantasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tec.diversionesfantasy.entity.Empleado;
import com.tec.diversionesfantasy.request.EmpleadoRequest;
import com.tec.diversionesfantasy.service.EmpleadoService;

@RestController
public class EmpleadoController {

	@Autowired
	EmpleadoService empleadoService;
	
	@GetMapping("get_all_empleados")
	public List<Empleado> getAllEmpleados(){
		return empleadoService.getAllEmpleados();
	}
	
	@GetMapping("get_empleado/{id}")
	public Empleado getEmpleado(@PathVariable Long id) {
		return empleadoService.getEmpleadoById(id);
	}
	
	@PostMapping("add_empleado")
	public Empleado addEmpleado(@RequestBody EmpleadoRequest request) {
		return empleadoService.addEmpleado(request);
	}
}
