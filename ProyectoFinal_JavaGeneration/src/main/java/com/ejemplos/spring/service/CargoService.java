package com.ejemplos.spring.service;

import java.util.List;

import com.ejemplos.spring.model.Cargo;

/**
 * Interfaz CargoService. 
 * 
 * @author Javier, Noemí, Óscar, Silvia, Usoa
 * @version 1.0
 */
public interface CargoService {

	/*
	 * Metodo que muestra un listado de los cargos guardados en la BBDD
	 */
	public List<Cargo> listarCargos();
	
}
