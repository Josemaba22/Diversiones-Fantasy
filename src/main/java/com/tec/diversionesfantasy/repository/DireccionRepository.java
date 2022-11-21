package com.tec.diversionesfantasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tec.diversionesfantasy.entity.Direccion;

@Repository 
public interface DireccionRepository extends JpaRepository<Direccion, Long>{

	public Direccion findById(int id);
	
}
