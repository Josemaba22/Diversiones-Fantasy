package com.tec.diversionesfantasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tec.diversionesfantasy.entity.Categoria;
import com.tec.diversionesfantasy.request.CategoriaRequest;
import com.tec.diversionesfantasy.service.CategoriaService;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {

	@Autowired
	CategoriaService categoriaService;
	
	@GetMapping("get_all")
	public List<Categoria> getAllCategorias(){
		return categoriaService.getAllCategorias();
	}
	
	@GetMapping("get/{id}")
	public Categoria getCategoria(@PathVariable Long id) {
		return categoriaService.getCategoriaById(id);
	}
	
	@PostMapping("add")
	public Categoria addCategoria(@RequestBody CategoriaRequest request) {
		return categoriaService.addCategoria(request);
	}
}
