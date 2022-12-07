package com.tec.diversionesfantasy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tec.diversionesfantasy.entity.Mobiliario;
import com.tec.diversionesfantasy.request.MobiliarioRequest;
import com.tec.diversionesfantasy.service.MobiliarioService;

@RestController
@RequestMapping("/api/mobiliario")
public class MobiliarioController {

	@Autowired
	MobiliarioService mobiliarioService;
	
	@GetMapping("get_all")
	public List<Mobiliario> getAllMobiliarios(){
		return mobiliarioService.getAllMobiliarios();
	}
	
	@GetMapping("get/{id}")
	public Mobiliario getMobiliario(@PathVariable Long id) {
		return mobiliarioService.getMobiliarioById(id);
	}
	
	@PostMapping("add")
	public Mobiliario addMobiliario(@RequestBody MobiliarioRequest request) {
		return mobiliarioService.addMobiliario(request);
	}
	

	
}
