package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Editorial;
 

public interface EditorialService {
	List<Editorial>listar();
	Editorial registrar(Editorial editorial);
	Editorial actualizar(Editorial editorial);
	void eliminar(Integer codigo);
	Editorial ListarporId(Integer codigo);
}
