package com.example.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="editorial")
public class Editorial {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "ID_Editorial")
private Integer ID_Editorial;
	@Column(name="RUC")
private Integer RUC;
	@Column(name="Nombre")
private String Nombre;
	@Column(name="Descripcion")
private String Descripcion;
	@Column(name="Direccion")
	private String Direccion;
	@Column(name="Telefono1")
	private String Telefono1;
	@Column(name="Telefono2")
	private String Telefono2;
	@Column(name="CorreoElectronico")
	private String CorreoElectronico	;
	@Column(name="FechaCreacion")
	private String FechaCreacion;
	@Column(name="Estado")
private String Estado;
	public Integer getID_Editorial() {
		return ID_Editorial;
	}
	public void setID_Editorial(Integer iD_Editorial) {
		ID_Editorial = iD_Editorial;
	}
	public Integer getRUC() {
		return RUC;
	}
	public void setRUC(Integer rUC) {
		RUC = rUC;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public String getTelefono1() {
		return Telefono1;
	}
	public void setTelefono1(String telefono1) {
		Telefono1 = telefono1;
	}
	public String getTelefono2() {
		return Telefono2;
	}
	public void setTelefono2(String telefono2) {
		Telefono2 = telefono2;
	}
	public String getCorreoElectronico() {
		return CorreoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		CorreoElectronico = correoElectronico;
	}
	public String getFechaCreacion() {
		return FechaCreacion;
	}
	public void setFechaCreacion(String fechaCreacion) {
		FechaCreacion = fechaCreacion;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	
	 
	
	
}