package com.tec.diversionesfantasy.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.diversionesfantasy.entity.Mobiliario;
import com.tec.diversionesfantasy.repository.CategoriaRepository;
import com.tec.diversionesfantasy.repository.MobiliarioRepository;
import com.tec.diversionesfantasy.request.MobiliarioRequest;

@Service
public class MobiliarioService {

	@Autowired
	MobiliarioRepository mobiliarioRepository;
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	public List<Mobiliario> getAllMobiliarios(){
		return mobiliarioRepository.findAll();
	}
	
	public Mobiliario getMobiliarioById(Long id) {
		return mobiliarioRepository.findById(id).get();
	}
	
	public Mobiliario addMobiliario(MobiliarioRequest request) {
		Mobiliario mobiliario = new Mobiliario();
		mobiliario.setId(request.getId());
		mobiliario.setNombre(request.getNombre());
		mobiliario.setPrecio_unitario(request.getPrecio_unitario());
		mobiliario.setExistencia(request.getExitencia());
		mobiliario.setImagen(request.getImagen());
		mobiliario.setCategoria_id(request.getCategoria_id());
		return mobiliarioRepository.save(mobiliario);
	}
	
	
	
}
