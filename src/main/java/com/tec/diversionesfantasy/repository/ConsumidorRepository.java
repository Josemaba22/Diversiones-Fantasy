package com.tec.diversionesfantasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tec.diversionesfantasy.entity.Consumidor;

@Repository
public interface ConsumidorRepository extends JpaRepository<Consumidor, Long>{

	public Consumidor findById(int id);
	
	
}
