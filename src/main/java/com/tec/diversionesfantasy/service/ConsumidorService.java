package com.tec.diversionesfantasy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tec.diversionesfantasy.entity.Consumidor;
import com.tec.diversionesfantasy.repository.ConsumidorRepository;
import com.tec.diversionesfantasy.request.ConsumidorRequest;

@Service
public class ConsumidorService {

	@Autowired
	ConsumidorRepository consumidorRepository;
	
	public List<Consumidor> getAllConsumidores(){
		return consumidorRepository.findAll();
	}
	
	public Consumidor getConsumidorById(Long id) {
		return consumidorRepository.findById(id).get();
	}
	
	public Consumidor addConsumidor(ConsumidorRequest consumidorRequest) {
		Consumidor consumidor = new Consumidor();
		consumidor.setId(consumidorRequest.getId());
		consumidor.setNombre(consumidorRequest.getNombre());
		consumidor.setApellido(consumidorRequest.getApellido());
		consumidor.setEmail(consumidorRequest.getEmail());
		consumidor.setTelefono(consumidorRequest.getTelefono());
		consumidor.setFecha_nacimiento(consumidorRequest.getFecha_nacimiento());
		consumidor.setSexo(consumidorRequest.getSexo());
		return consumidorRepository.save(consumidor);
	}
}
