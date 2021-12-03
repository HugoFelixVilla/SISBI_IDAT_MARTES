package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PersonaService;

@Controller 
public class HomeWebController {

	@Autowired
private PersonaService personalservices;
	
	
	
	
	@GetMapping({"/"})
	public String index() {
		return "home";
	}
	
	@GetMapping("/index")
	//CAPTURO EL NOMBRE DE USUARIO:
	public String mostrarindex(Authentication auth,HttpSession session) {
		String username=auth.getName();
		System.out.println("Nombre del usuario: " + username);
		
		//CAPTURO EL ROL O TIPO DE USUARIO:
		for(GrantedAuthority rol: auth.getAuthorities()) {
			System.out.println("ROL " + rol.getAuthority());
		}
		
		//ALMACENAMOS DATOS EN EL PERSONAL:
		
//		if(session.getAttribute("Personal")==null) {
//			Personal personal =personalservices.buscarPorUsername(username);
//			//Para mayor seguridad la contraseña será nula
//			System.out.println("Personal"+personal);
//			personal.setClave(null);
//			session.setAttribute("Personal", personal);
//		}
		
		
		return "redirect:/";
	}
	
	
	@GetMapping({"/login"})
	public String mostrarlogin() {
		return "login";
	}
}
