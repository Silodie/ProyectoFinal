package com.ejemplos.spring.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.ejemplos.spring.service.CargoService;
import com.ejemplos.spring.service.EmpleadoService;

/**
 * Clase HomeController. Se encarga de interceptar la llamada y presentar las paginas de los proyectos principales
 * 
 * @author Javier, Noemí, Óscar, Silvia, Usoa
 * @version 1.0
 */

@Controller
public class HomeController {

	/*
	 * Lleva a la pagina principal del proyecto
	 */
	@GetMapping("/")
	public String viewHome () {
		return "home";
	}
	
	/*
	 * Lleva a la pagina del proyecto Movieflix
	 */
	@GetMapping("/proyectos/movieflix")
	public String viewMovieFlix() {
		return "movieflix";
	}
	
	/*
	 * Lleva a la pagina del proyecto de Landing Page
	 */
	@GetMapping("/proyectos/landing")
	public String viewLanding() {
		return "landing";
	}
	
	/*
	 * Lleva a la pagina donde se publican las ofertas de empleo
	 */
	@GetMapping("/empleo")
	public String viewEmpleo() {
		return "empleo";
	}
	
	
	
		
	
	
}
