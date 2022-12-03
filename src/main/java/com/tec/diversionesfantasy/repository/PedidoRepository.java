package com.tec.diversionesfantasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tec.diversionesfantasy.entity.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

	public Pedido findById(int id);
	
}
