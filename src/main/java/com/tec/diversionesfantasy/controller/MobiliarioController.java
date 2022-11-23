package com.tec.diversionesfantasy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tec.diversionesfantasy.entity.Mobiliario;
import com.tec.diversionesfantasy.request.MobiliarioRequest;
import com.tec.diversionesfantasy.service.MobiliarioService;

@RestController
public class MobiliarioController {

	@Autowired
	MobiliarioService mobiliarioService;
	
	@PostMapping("add_mobiliario")
	public Mobiliario addMobiliario(@RequestBody MobiliarioRequest request) {
		return mobiliarioService.addMobiliario(request);
	}
	

	
}
