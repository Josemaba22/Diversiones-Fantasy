package com.tec.diversionesfantasy.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@PostMapping("add_empleado")
	public Empleado addEmpleado(@RequestBody EmpleadoRequest request) {
		return empleadoService.addEmpleado(request);
	}
}
