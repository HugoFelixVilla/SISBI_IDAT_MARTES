package com.example.demo.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
@EnableWebSecurity
public class DatabaseWebSecurity extends WebSecurityConfigurerAdapter {
	/*
	 * ESTOY LLAMANDA A 2 TABLAS POR DEFECTO QUE VIENEN POR SPRINGSECURITY: users y
	 * authorities
	 */
	@Autowired
	private DataSource dataSource;

	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		/*
		 * ESTOY LLAMANDA A 2 TABLAS POR DEFECTO QUE VIENEN POR SPRINGSECURITY: users y
		 * authorities
		 */
//		auth.jdbcAuthentication().dataSource(dataSource);
		auth.jdbcAuthentication().dataSource(dataSource)

				// BUSCO EL USUARIO DESDE LA BASE DE DATOS:

				// SALIO ERROR PORQUE FALTA ESTADO:
				// .usersByUsernameQuery("select Usuarios, Clave from personal where
				// Usuarios=?")

				.usersByUsernameQuery("select Dni, clave,Estado from persona where Dni=?")
				// BUSCO EL TIPO DE USUARIO (AUTORIDAD)
				.authoritiesByUsernameQuery("select p.Dni, r.Nombre from persona p "
						+ "inner join rol r on r.ID_Rol = p.ID_Rol " + "where p.Dni = ?");

	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
	http.authorizeRequests()
	// Los recursos estáticos no requieren autenticación
	.antMatchers(
            "/css/**",  
            "/assets/**", 
            "/js/**",
            "/images/**").permitAll()
    
    // Las vistas públicas no requieren autenticación
    .antMatchers("/", 
    			 "/index",
    			 "/home").permitAll()
    
 // Asignar permisos a URLs por ROLES
    .antMatchers("/persona/**").hasAnyAuthority("ADMINISTRADOR") 
    .antMatchers("/editorial/**").hasAnyAuthority("BIBLIOTECARIO") 
    .antMatchers("/especialidad/**").hasAnyAuthority("BIBLIOTECARIO") 
    .antMatchers("/rol/**").hasAnyAuthority("ADMINISTRADOR") 

	// Todas las demás URLs de la Aplicación requieren autenticación
	.anyRequest().authenticated()
	  // El formulario de Login no requiere autenticacion
    .and()
    .formLogin().loginPage("/login").permitAll()  
    .and().logout().permitAll();
		 
		
	}
	
}
