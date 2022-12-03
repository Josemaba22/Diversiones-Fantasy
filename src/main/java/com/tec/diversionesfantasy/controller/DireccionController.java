package com.tec.diversionesfantasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("get_all_direcciones")
	public List<Direccion> getAllDirecciones(){
		return direccionService.getAllDirecciones();
	}
	
	@GetMapping("get_direccion/{id}")
	public Direccion getDireccion(@PathVariable Long id) {
		return direccionService.getDireccionById(id);
	}
	
	@PostMapping("add_direccion")
	public Direccion addDireccion(@RequestBody DireccionRequest request) {
		return direccionService.addDireccion(request);
	}
}
