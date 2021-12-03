package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.modelo.Rol;
import com.example.demo.service.RolService;

@RestController 
@RequestMapping("/rol")
public class RolController { 
		@Autowired
		RolService service;
		
	//	@RequestMapping("/listarTodo")
		@GetMapping
		public ResponseEntity<List<Rol>>listar(){
			 List<Rol> obj=service.listar();
			 return new ResponseEntity<List<Rol>>(obj,HttpStatus.OK);
		}
		
		@PostMapping
		public ResponseEntity<Void> registrar(@RequestBody Rol rol){
			Rol obj=service.registrar(rol);
			URI uri= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getID_Rol()).toUri();
			// return new ResponseEntity<Persona>(obj,HttpStatus.OK);
			return ResponseEntity.created(uri).build();
		}
		
		
		@PutMapping
		public ResponseEntity<Rol> actualizar(@RequestBody Rol rol){
			Rol obj=service.actualizar(rol);
			return new ResponseEntity<Rol>(obj,HttpStatus.OK);
		}
		
		@DeleteMapping("/{id}")
		public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception{
			Rol obj=service.ListarporId(id);
			if(obj ==null) {
				throw  new Exception("No se encontró el ID");
			}
			service.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		
		
		@GetMapping("/{id}")
		public ResponseEntity<Rol>listarporId(@PathVariable("id") Integer codigo)  throws Exception{
			
			Rol obj=service.ListarporId(codigo);
			if(obj ==null) {
				throw  new Exception("No se encontró el ID");
			}
			 
			return new ResponseEntity<Rol>(obj,HttpStatus.OK);
		}
		
	 
}
