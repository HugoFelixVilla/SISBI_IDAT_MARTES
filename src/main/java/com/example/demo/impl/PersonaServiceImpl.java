package com.example.demo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Persona;
import com.example.demo.repository.PersonaRepository;
import com.example.demo.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	PersonaRepository repo;
	
	@Override
	public List<Persona> listar() {
		return repo.findAll();
	}

	@Override
	public Persona registrar(Persona persona) {
		return repo.save(persona);
	}

	@Override
	public Persona actualizar(Persona persona) {
		return repo.save(persona);
	}

	@Override
	public void eliminar(Integer codigo) {
		repo.deleteById(codigo);
		
	}

	@Override
	public Persona ListarporId(Integer codigo) {
		//EN CASO NO ENCONTRAR DEVUELVE VACIO
		 return repo.findById(codigo).orElse(null);
	}

}
