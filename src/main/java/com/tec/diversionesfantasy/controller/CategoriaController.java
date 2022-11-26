package com.tec.diversionesfantasy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tec.diversionesfantasy.entity.Categoria;
import com.tec.diversionesfantasy.request.CategoriaRequest;
import com.tec.diversionesfantasy.service.CategoriaService;

@RestController
public class CategoriaController {

	@Autowired
	CategoriaService categoriaService;
	
	@PostMapping("add_categoria")
	public Categoria addCategoria(@RequestBody CategoriaRequest request) {
		return categoriaService.addCategoria(request);
	}
}