package com.example.demo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Editorial;
import com.example.demo.repository.EditorialRepository;
import com.example.demo.service.EditorialService;
 


@Service
public class EditorialServiceImpl implements EditorialService {
	
	@Autowired
	EditorialRepository repo;

	@Override
	public List<Editorial> listar() {
		return repo.findAll();
	}

	@Override
	public Editorial registrar(Editorial editorial) {
		return repo.save(editorial);
	}

	@Override
	public Editorial actualizar(Editorial editorial) {
		return repo.save(editorial);
	}

	@Override
	public void eliminar(Integer codigo) {
		repo.deleteById(codigo);
		
	}

	@Override
	public Editorial ListarporId(Integer codigo) {
		//EN CASO NO ENCONTRAR DEVUELVE VACIO
		 return repo.findById(codigo).orElse(null);
	}

}
