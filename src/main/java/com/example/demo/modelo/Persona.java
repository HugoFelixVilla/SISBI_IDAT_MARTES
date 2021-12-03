package com.example.demo.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "ID_Persona")
private Integer ID_Persona;
	@Column(name="Dni")
private String Dni;
	@Column(name="Nombre")
private String Nombre;
	@Column(name="Apellidos")
	private String Apellidos;
	 

	@Column(name="Direccion")
	private String Direccion;
	@Column(name="Telefono")
	private String Telefono; 
	@Column(name="CorreoElectronico")
	private String CorreoElectronico;	
	@Column(name="Clave")
private String Clave; 
	@Column(name="Estado")	
private String Estado;
	
	
	 @ManyToOne
	 @JoinColumn(name="ID_Rol")
	 private Rol rol;


	public Integer getID_Persona() {
		return ID_Persona;
	}


	public void setID_Persona(Integer iD_Persona) {
		ID_Persona = iD_Persona;
	}


	public String getDni() {
		return Dni;
	}


	public void setDni(String dni) {
		Dni = dni;
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	 

	public String getDireccion() {
		return Direccion;
	}


	public void setDireccion(String direccion) {
		Direccion = direccion;
	}


	 


	public String getApellidos() {
		return Apellidos;
	}


	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}


	public String getTelefono() {
		return Telefono;
	}


	public void setTelefono(String telefono) {
		Telefono = telefono;
	}


	public String getClave() {
		return Clave;
	}


	public void setClave(String clave) {
		Clave = clave;
	}


	public String getCorreoElectronico() {
		return CorreoElectronico;
	}


	public void setCorreoElectronico(String correoElectronico) {
		CorreoElectronico = correoElectronico;
	}


	 


	public String getEstado() {
		return Estado;
	}


	public void setEstado(String estado) {
		Estado = estado;
	}


	public Rol getRol() {
		return rol;
	}


	public void setRol(Rol rol) {
		this.rol = rol;
	}
	 
	 
	 
	
}
