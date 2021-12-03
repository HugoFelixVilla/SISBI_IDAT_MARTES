package com.example.demo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Especialidad;
import com.example.demo.repository.EspecialidadRepository;
import com.example.demo.service.EspecialidadService;
 

@Service
public class EspecialidadServiceImpl implements EspecialidadService {

	@Autowired
	EspecialidadRepository repo;
	
	
	@Override
	public List<Especialidad> listar() {
		return repo.findAll();
	}

	@Override
	public Especialidad registrar(Especialidad especialidad) {
		return repo.save(especialidad);
	}

	@Override
	public Especialidad actualizar(Especialidad especialidad) {
		return repo.save(especialidad);
	}

	@Override
	public void eliminar(Integer codigo) {
		repo.deleteById(codigo);
		
	}

	@Override
	public Especialidad ListarporId(Integer codigo) {
		//EN CASO NO ENCONTRAR DEVUELVE VACIO
		 return repo.findById(codigo).orElse(null);
	}

}
