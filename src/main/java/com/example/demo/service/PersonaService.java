package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Persona;

public interface PersonaService {
	List<Persona>listar();
	Persona registrar(Persona persona);
	Persona actualizar(Persona persona);
	void eliminar(Integer codigo);
	Persona ListarporId(Integer codigo);
}
