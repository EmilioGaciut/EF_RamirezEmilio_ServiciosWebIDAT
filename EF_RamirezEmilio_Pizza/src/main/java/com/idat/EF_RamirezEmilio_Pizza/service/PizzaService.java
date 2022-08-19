package com.idat.EF_RamirezEmilio_Pizza.service;

import com.idat.EF_RamirezEmilio_Pizza.dto.Cliente;
import com.idat.EF_RamirezEmilio_Pizza.dto.Pizzeria;

public interface PizzaService {
	void guardarCliente(Cliente cliente);
	void guardarPizzeria(Pizzeria pizzeria);
	void asignarPizzeriaPizza();
	void asignarClientePizza();
}
