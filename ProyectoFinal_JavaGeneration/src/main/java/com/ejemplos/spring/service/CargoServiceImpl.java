package com.ejemplos.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplos.spring.model.Cargo;
import com.ejemplos.spring.repository.CargoRepository;

/**
 * Clase CargoServiceImpl. Implementa los metodos llamados en su interfaz correspondiente
 * 
 * @author Javier, Noemí, Óscar, Silvia, Usoa
 * @version 1.0
 * @see CargoRepository
 */
@Service
public class CargoServiceImpl implements CargoService {

	@Autowired
	CargoRepository cargoRepo;

	
	/*
	 * Metodo para mostrar un listado de los cargos guardados en la BBDD
	 */
	@Override
	public List<Cargo> listarCargos() {
		return cargoRepo.findAll();
	}
	
	
	

}
