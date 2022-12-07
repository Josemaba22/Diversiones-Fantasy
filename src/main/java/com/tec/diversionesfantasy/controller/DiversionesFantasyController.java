package com.tec.diversionesfantasy.controller;


import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tec.diversionesfantasy.request.CategoriaRequest;
import com.tec.diversionesfantasy.request.ConsumidorRequest;
import com.tec.diversionesfantasy.request.DetallePedidoRequest;
import com.tec.diversionesfantasy.request.DireccionRequest;
import com.tec.diversionesfantasy.request.EmpleadoRequest;
import com.tec.diversionesfantasy.request.MobiliarioRequest;
import com.tec.diversionesfantasy.request.PedidoRequest;
import com.tec.diversionesfantasy.service.CategoriaService;
import com.tec.diversionesfantasy.service.ConsumidorService;
import com.tec.diversionesfantasy.service.DireccionService;
import com.tec.diversionesfantasy.service.EmpleadoService;
import com.tec.diversionesfantasy.service.MobiliarioService;
import com.tec.diversionesfantasy.service.PedidoService;

@RestController
@RequestMapping("/api/diversionesfantasy")
public class DiversionesFantasyController {
	
	@Autowired
	CategoriaService categoriaService;
	
	@Autowired
	ConsumidorService consumidorService;
	
	@Autowired
	DireccionService direccionService;
	
	@Autowired
	EmpleadoService empleadoService;
	
	@Autowired
	MobiliarioService mobiliarioService;
	
	@Autowired
	PedidoService pedidoService;
	
	@GetMapping("/")
	public String holaMundo() {
		return "Hola Mundo";
	}
	
	@PostMapping("inserta_datos_bd")
	public void insertaDatosBd() {
		CategoriaRequest categoria1 = new CategoriaRequest(0L, "Mesa", "Planicie con patas de soporte");
		CategoriaRequest categoria2 = new CategoriaRequest(0L, "Silla", "Planicie con patas de soporte");
		CategoriaRequest categoria3 = new CategoriaRequest(0L, "Brincolin", "Estructura de plastico cocido, se infla con aire");
		categoriaService.addCategoria(categoria1);
		categoriaService.addCategoria(categoria2);
		categoriaService.addCategoria(categoria3);
		
		
		ConsumidorRequest consumidor1 = new ConsumidorRequest(0L, "Jose", "Barraza", "josemaba22@gmail.com","6674223311",LocalDate.parse("1999-11-02"),'M');
		ConsumidorRequest consumidor2 = new ConsumidorRequest(0L, "Javier", "Rendon", "javier@gmail.com","6674223322",LocalDate.parse("1999-11-02"),'M');
		consumidorService.addConsumidor(consumidor1);
		consumidorService.addConsumidor(consumidor2);
		
		DireccionRequest direccion1 = new DireccionRequest(0L, "Mezquitillo", "De los cardones", "Lechuguilla", 80280,0, 3378, "Entra al portal interdimensional");
		DireccionRequest direccion2 = new DireccionRequest(0L, "Burocrata", "De las Americas", "Blvd. Universitarios", 80030, 0, 4772, "Jarin Botanico");

		direccionService.addDireccion(direccion1);
		direccionService.addDireccion(direccion2);
		
		
		EmpleadoRequest empleado1 = new EmpleadoRequest(0L, "Gabriel", "Loya", "gabriel@gmail.com", "admin123", "6677223344", 1, 2500.25, LocalDate.parse("1999-01-02"), LocalDate.parse("2020-01-02"), 'M', "ADMINISTRADOR");
		EmpleadoRequest empleado2 = new EmpleadoRequest(0L, "Berenice", "Olivas", "berenice@gmail.com", "camioneta123", "6677223366", 2, 2500.25, LocalDate.parse("1999-12-03"), LocalDate.parse("2020-01-02"), 'F', "TRANSPORTISTA");

		empleadoService.addEmpleado(empleado1);
		empleadoService.addEmpleado(empleado2);
		
		
		
		MobiliarioRequest mobiliario1 = new MobiliarioRequest(0L, "Mesa Circular", 500.25, 100, "C:user/proyecto", 1);
		MobiliarioRequest mobiliario2 = new MobiliarioRequest(0L, "Mesa Rectangular", 500.25, 100, "C:user/proyecto", 1);
		MobiliarioRequest mobiliario3 = new MobiliarioRequest(0L, "Mesa Cuadrada", 500.25, 100, "C:user/proyecto", 1);
		MobiliarioRequest mobiliario4 = new MobiliarioRequest(0L, "Silla Escarlata", 40.25, 100, "C:user/proyecto", 2);
		MobiliarioRequest mobiliario5 = new MobiliarioRequest(0L, "Silla Imperio", 40.25, 100, "C:user/proyecto", 2);
		MobiliarioRequest mobiliario6 = new MobiliarioRequest(0L, "Brincolin Spiderman", 500.25, 100, "C:user/proyecto", 1);
		mobiliarioService.addMobiliario(mobiliario1);
		mobiliarioService.addMobiliario(mobiliario2);
		mobiliarioService.addMobiliario(mobiliario3);
		mobiliarioService.addMobiliario(mobiliario4);
		mobiliarioService.addMobiliario(mobiliario5);
		mobiliarioService.addMobiliario(mobiliario6);

		PedidoRequest pedido1 = new PedidoRequest(0L,LocalDate.parse("2022-12-05"), LocalDate.parse("2022-12-08"), 1, 1, 2, 1, "Casa porton dorado frente al parke", "Sin daños resgistrados");
		DetallePedidoRequest detalle11 = new DetallePedidoRequest(1L, 1L, 10);
		DetallePedidoRequest detalle12 = new DetallePedidoRequest(1L, 2L, 5);
		DetallePedidoRequest detalle13 = new DetallePedidoRequest(1L, 3L, 5);
		pedido1.detalle_pedido.add(detalle11);
		pedido1.detalle_pedido.add(detalle12);
		pedido1.detalle_pedido.add(detalle13);
		pedidoService.addPedido(pedido1);
	}

}
