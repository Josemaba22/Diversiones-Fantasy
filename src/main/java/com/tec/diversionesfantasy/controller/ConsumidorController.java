package com.tec.diversionesfantasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tec.diversionesfantasy.entity.Consumidor;
import com.tec.diversionesfantasy.request.ConsumidorRequest;
import com.tec.diversionesfantasy.service.ConsumidorService;

@RestController
@RequestMapping("/api/consumidor")
public class ConsumidorController {

	@Autowired
	ConsumidorService consumidorService;
	
	@GetMapping("get_all")
	public List<Consumidor> getAllConsumidores(){
		return consumidorService.getAllConsumidores();
	}
	
	@GetMapping("get/{id}")
	public Consumidor getConsumidor(@PathVariable Long id) {
		return consumidorService.getConsumidorById(id);
	}
	
	@PostMapping("add")
	public Consumidor addConsumidor(@RequestBody ConsumidorRequest consumidorRequest) {
		return consumidorService.addConsumidor(consumidorRequest); 
	}
	
}
