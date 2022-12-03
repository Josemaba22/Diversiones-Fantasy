package com.tec.diversionesfantasy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.diversionesfantasy.entity.Direccion;
import com.tec.diversionesfantasy.repository.DireccionRepository;
import com.tec.diversionesfantasy.request.DireccionRequest;

@Service
public class DireccionService {

	@Autowired
	DireccionRepository direccionRepository;
	
	public List<Direccion> getAllDirecciones(){
		return direccionRepository.findAll();
	}
	
	public Direccion getDireccionById(Long id) {
		return direccionRepository.findById(id).get();
	}
	
	public Direccion addDireccion(DireccionRequest direccionRequest) {
		Direccion direccion = new Direccion();
		direccion.setId(direccionRequest.id);
		direccion.setColonia(direccionRequest.colonia);
		direccion.setCalle1(direccionRequest.calle1);
		direccion.setCalle2(direccionRequest.calle2);
		direccion.setCodigo_postal(direccionRequest.codigo_postal);
		direccion.setNumero_interior(direccionRequest.numero_interior);
		direccion.setNumero_exterior(direccionRequest.numero_exterior);
		direccion.setDescripcion(direccionRequest.descripcion);
		return direccionRepository.save(direccion);
	}
	
}
