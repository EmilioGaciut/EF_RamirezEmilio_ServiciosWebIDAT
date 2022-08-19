package com.idat.EF_RamirezEmilio_Pizzeria.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.EF_RamirezEmilio_Pizzeria.model.Pizzeria;
import com.idat.EF_RamirezEmilio_Pizzeria.repository.PizzeriaRepository;



public class PizzeriaServiceImpl implements PizzeriaService{

	@Autowired
	private PizzeriaRepository repository;

	@Override
	public List<Pizzeria> listar() {
		return repository.findAll();
	}

	@Override
	public Pizzeria obtenerId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Pizzeria pizzeria) {
		repository.save(pizzeria);
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public void actualizar(Pizzeria pizzeria) {
		repository.saveAndFlush(pizzeria);
	}

}
