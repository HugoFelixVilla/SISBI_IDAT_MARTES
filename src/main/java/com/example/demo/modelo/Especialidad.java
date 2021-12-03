package com.example.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="especialidad")
public class Especialidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "ID_Especialidad")
private Integer ID_Especialidad;
	@Column(name="Nombre")
private String Nombre;
	@Column(name="Descripcion")
private Integer Descripcion;
	@Column(name="Estado")
private String Estado;
 
	
	
	
	public Integer getID_Especialidad() {
		return ID_Especialidad;
	}
	public void setID_Especialidad(Integer iD_Especialidad) {
		ID_Especialidad = iD_Especialidad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public Integer getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(Integer descripcion) {
		Descripcion = descripcion;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	
}