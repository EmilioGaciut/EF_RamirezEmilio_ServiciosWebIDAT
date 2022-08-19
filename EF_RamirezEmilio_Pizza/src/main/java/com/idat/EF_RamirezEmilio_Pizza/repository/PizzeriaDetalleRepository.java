package com.idat.EF_RamirezEmilio_Pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.EF_RamirezEmilio_Pizza.dto.Pizzeria;
import com.idat.EF_RamirezEmilio_Pizza.entity.PizzeriaDetalle;



public interface PizzeriaDetalleRepository extends JpaRepository<PizzeriaDetalle, Integer>{

	void save(Pizzeria pizzeria);

}
