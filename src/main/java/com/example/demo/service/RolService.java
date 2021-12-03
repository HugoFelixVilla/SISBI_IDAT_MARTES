package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Rol;

public interface RolService {
	List<Rol>listar();
	Rol registrar(Rol rol);
	Rol actualizar(Rol rol);
	void eliminar(Integer codigo);
	Rol ListarporId(Integer codigo);
}
