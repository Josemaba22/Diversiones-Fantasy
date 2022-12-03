package com.tec.diversionesfantasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tec.diversionesfantasy.entity.Mobiliario;

@Repository
public interface MobiliarioRepository extends JpaRepository<Mobiliario, Long>{

	public Mobiliario findById(int id);
	
}
