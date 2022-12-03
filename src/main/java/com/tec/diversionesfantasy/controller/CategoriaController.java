package com.tec.diversionesfantasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("get_all_categorias")
	public List<Categoria> getAllCategorias(){
		return categoriaService.getAllCategorias();
	}
	
	@GetMapping("get_categoria/{id}")
	public Categoria getCategoria(@PathVariable Long id) {
		return categoriaService.getCategoriaById(id);
	}
	
	@PostMapping("add_categoria")
	public Categoria addCategoria(@RequestBody CategoriaRequest request) {
		return categoriaService.addCategoria(request);
	}
}
