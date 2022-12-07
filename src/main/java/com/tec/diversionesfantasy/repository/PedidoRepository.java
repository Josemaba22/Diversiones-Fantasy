package com.tec.diversionesfantasy.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tec.diversionesfantasy.entity.Pedido;


@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

	public Pedido findById(int id);
	
	/*
	@Query("SELECT p FROM diversionesfantasy.pedidos p\r\n"
			+ "WHERE p.estatus='POR RECOGER'\r\n"
			+ "")
	public List<Pedido> porRecoger();
	*/
	
}
