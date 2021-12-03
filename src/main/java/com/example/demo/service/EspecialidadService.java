package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Especialidad;

public interface EspecialidadService {
	List<Especialidad>listar();
	Especialidad registrar(Especialidad especialidad);
	Especialidad actualizar(Especialidad especialidad);
	void eliminar(Integer codigo);
	Especialidad ListarporId(Integer codigo);
}
