package com.idat.EF_RamirezEmilio_Pizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.EF_RamirezEmilio_Pizza.client.OPenFeignPizzeria;
import com.idat.EF_RamirezEmilio_Pizza.client.OpenFeignCliente;
import com.idat.EF_RamirezEmilio_Pizza.dto.Cliente;
import com.idat.EF_RamirezEmilio_Pizza.dto.Pizzeria;
import com.idat.EF_RamirezEmilio_Pizza.entity.ClienteDetalle;
import com.idat.EF_RamirezEmilio_Pizza.entity.PizzaClienteFK;
import com.idat.EF_RamirezEmilio_Pizza.entity.PizzaPizzeriaFK;
import com.idat.EF_RamirezEmilio_Pizza.entity.PizzeriaDetalle;
import com.idat.EF_RamirezEmilio_Pizza.repository.ClienteDetalleRepository;
import com.idat.EF_RamirezEmilio_Pizza.repository.PizzaRepository;
import com.idat.EF_RamirezEmilio_Pizza.repository.PizzeriaDetalleRepository;


public class PizzaServiceImpl implements PizzaService{

	@Autowired
	private PizzaRepository repositoryPizza;
	
	@Autowired
	private ClienteDetalleRepository repositoryClienteDetalle;
	
	@Autowired
	private PizzeriaDetalleRepository repositoryPizzeriaDetalle;
	
	@Autowired
	private OpenFeignCliente feignCliente;
	
	@Autowired
	private OPenFeignPizzeria feignPizzeria;

	@Override
	public void asignarPizzeriaPizza() {
		List<Pizzeria> listado = feignPizzeria.listaPizzeriaSeleccionados();
		PizzaPizzeriaFK fk = null;
		PizzeriaDetalle detalle = null;

		
		for (Pizzeria pizzeria : listado) {
			
			fk = new PizzaPizzeriaFK();
			fk.setIdPizzeria(pizzeria.getIdPizzeria());
			fk.setIdPizza(1);
			
			detalle = new PizzeriaDetalle();
			detalle.setFk(fk);	
			
			repositoryPizzeriaDetalle.save(detalle);
		}
	}

	@Override
	public void asignarClientePizza() {
		List<Cliente> listado = feignCliente.listaClientesSeleccionados();
		PizzaClienteFK fk = null;
		ClienteDetalle detalle = null;

		
		for (Cliente cliente : listado) {
			
			fk = new PizzaClienteFK();
			fk.setIdCliente(cliente.getIdCliente());
			fk.setIdPizza(1);
			
			detalle = new ClienteDetalle();
			detalle.setFk(fk);	
			
			repositoryClienteDetalle.save(detalle);
		}
	}

	@Override
	public void guardarCliente(Cliente cliente) {
		repositoryClienteDetalle.save(cliente);
	}

	@Override
	public void guardarPizzeria(Pizzeria pizzeria) {
		repositoryPizzeriaDetalle.save(pizzeria);
	}

	

}
