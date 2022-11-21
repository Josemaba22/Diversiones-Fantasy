package com.tec.diversionesfantasy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tec.diversionesfantasy.entity.Direccion;
import com.tec.diversionesfantasy.repository.DireccionRepository;
import com.tec.diversionesfantasy.request.DireccionRequest;

@Service
public class DireccionService {

	@Autowired
	DireccionRepository direccionRepository;
	
	public Direccion addDireccion(DireccionRequest direccionRequest) {
		Direccion direccion = new Direccion();
		direccion.setId(direccionRequest.getId());
		direccion.setColonia(direccionRequest.getColonia());
		direccion.setCalle1(direccionRequest.getCalle1());
		direccion.setCalle2(direccionRequest.getCalle2());
		direccion.setNumero_interior(direccionRequest.getNumero_interior());
		direccion.setNumero_exterior(direccionRequest.getNumero_exterior());
		direccion.setDescripcion(direccionRequest.getDescripcion());
		return direccionRepository.save(direccion);
	}
	
}
