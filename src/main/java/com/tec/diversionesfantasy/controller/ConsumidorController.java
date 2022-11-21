package com.tec.diversionesfantasy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tec.diversionesfantasy.entity.Consumidor;
import com.tec.diversionesfantasy.request.ConsumidorRequest;
import com.tec.diversionesfantasy.service.ConsumidorService;

@RestController
public class ConsumidorController {

	@Autowired
	ConsumidorService consumidorService;
	
	@PostMapping("add_consumidor")
	public Consumidor addConsumidor(@RequestBody ConsumidorRequest consumidorRequest) {
		return consumidorService.addConsumidor(consumidorRequest); 
	}
	
}
