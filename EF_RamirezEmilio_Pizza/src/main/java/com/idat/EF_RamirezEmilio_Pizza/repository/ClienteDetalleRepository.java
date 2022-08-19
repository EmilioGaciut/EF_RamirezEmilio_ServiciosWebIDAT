package com.idat.EF_RamirezEmilio_Pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.idat.EF_RamirezEmilio_Pizza.dto.Cliente;
import com.idat.EF_RamirezEmilio_Pizza.entity.ClienteDetalle;


public interface ClienteDetalleRepository extends JpaRepository<ClienteDetalle, Integer>{

	void save(Cliente cliente);

}
