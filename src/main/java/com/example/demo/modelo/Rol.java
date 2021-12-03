package com.example.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rol")
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "ID_Rol")
private Integer ID_Rol;
	@Column(name="Nombre")
private String Nombre; 
	@Column(name="Estado")
private String Estado;
	public Integer getID_Rol() {
		return ID_Rol;
	}
	public void setID_Rol(Integer iD_Rol) {
		ID_Rol = iD_Rol;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	 
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	
	
	
}