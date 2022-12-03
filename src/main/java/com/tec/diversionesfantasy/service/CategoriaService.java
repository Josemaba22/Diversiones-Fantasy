package com.tec.diversionesfantasy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.diversionesfantasy.entity.Categoria;
import com.tec.diversionesfantasy.repository.CategoriaRepository;
import com.tec.diversionesfantasy.request.CategoriaRequest;

@Service
public class CategoriaService {

	@Autowired
	CategoriaRepository categoriaRepository;
	
	public List<Categoria> getAllCategorias(){
		return categoriaRepository.findAll();
	}
	
	public Categoria getCategoriaById(Long id) {
		return categoriaRepository.findById(id).get();
	}
	
	public Categoria addCategoria(CategoriaRequest request) {
		Categoria categoria = new Categoria();
		categoria.setId(request.getId());
		categoria.setNombre(request.getNombre());
		categoria.setDescripcion(request.getDescripcion());
		return categoriaRepository.save(categoria);
	}
	
}
