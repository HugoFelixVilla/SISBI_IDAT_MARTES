package com.example.demo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Rol;
import com.example.demo.repository.RolRepository;
import com.example.demo.service.RolService;

@Service
public class RolServiceImpl implements RolService {

	@Autowired
	RolRepository repo;
	
	@Override
	public List<Rol> listar() {
		return repo.findAll();
	}

	@Override
	public Rol registrar(Rol rol) {
		return repo.save(rol);
	}

	@Override
	public Rol actualizar(Rol rol) {
		return repo.save(rol);
	}

	@Override
	public void eliminar(Integer codigo) {
		repo.deleteById(codigo);
		
	}

	@Override
	public Rol ListarporId(Integer codigo) {
		//EN CASO NO ENCONTRAR DEVUELVE VACIO
		 return repo.findById(codigo).orElse(null);
	}
	
	

}
