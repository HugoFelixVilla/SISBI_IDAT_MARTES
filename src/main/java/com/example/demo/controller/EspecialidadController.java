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

import com.example.demo.modelo.Especialidad;
import com.example.demo.service.EspecialidadService;
 
@RestController 
@RequestMapping("/especialidad")
public class EspecialidadController {
	
	 
		@Autowired
		EspecialidadService service;
		
		@GetMapping
		public ResponseEntity<List<Especialidad>>listar(){
			 List<Especialidad> obj=service.listar();
			 return new ResponseEntity<List<Especialidad>>(obj,HttpStatus.OK);
		}
		
		@PostMapping
		public ResponseEntity<Void> registrar(@RequestBody Especialidad especialidad){
			Especialidad obj=service.registrar(especialidad);
			URI uri= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getID_Especialidad()).toUri();
			// return new ResponseEntity<Persona>(obj,HttpStatus.OK);
			return ResponseEntity.created(uri).build();
		}
		
		
		@PutMapping
		public ResponseEntity<Especialidad> actualizar(@RequestBody Especialidad especialidad){
			Especialidad obj=service.actualizar(especialidad);
			return new ResponseEntity<Especialidad>(obj,HttpStatus.OK);
		}
		
		@DeleteMapping("/{id}")
		public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) throws Exception{
			Especialidad obj=service.ListarporId(id);
			if(obj ==null) {
				throw  new Exception("No se encontró el ID");
			}
			service.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		

		@GetMapping("/{id}")
		public ResponseEntity<Especialidad>listarporId(@PathVariable("id") Integer codigo)  throws Exception{
			
			Especialidad obj=service.ListarporId(codigo);
			if(obj ==null) {
				throw  new Exception("No se encontró el ID");
			}
			 
			return new ResponseEntity<Especialidad>(obj,HttpStatus.OK);
		}
		
	 
}
