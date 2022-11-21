package com.tec.diversionesfantasy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tec.diversionesfantasy.entity.Direccion;
import com.tec.diversionesfantasy.request.DireccionRequest;
import com.tec.diversionesfantasy.service.DireccionService;

@RestController
public class DireccionController {

	@Autowired
	DireccionService direccionService;
	
	@PostMapping("add_direccion")
	public Direccion addDireccion(@RequestBody DireccionRequest request) {
		return direccionService.addDireccion(request);
	}
}
