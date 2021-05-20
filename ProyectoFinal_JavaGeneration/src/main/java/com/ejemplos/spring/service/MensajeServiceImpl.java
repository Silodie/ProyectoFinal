package com.ejemplos.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ejemplos.spring.model.Mensaje;
import com.ejemplos.spring.repository.MensajeRepository;

/**
 * Clase EmpleadoController. Intercepta la llamada del navegador para que entre
 * por el control.
 * 
 * @author Javier, Noemí, Óscar, Silvia, Usoa
 * @version 1.0
 */
@Service
public class MensajeServiceImpl implements MensajeService {

	@Autowired
	MensajeRepository mensajeRepo;

	/*
	 * Metodo para mostrar un listado de los mensajes recibidos en el Gestor
	 */
	@Override
	public List<Mensaje> listarMensajes() {
		return mensajeRepo.findAll();
	}

	/*
	 * Metodo para guardar un nuevo mensaje
	 */
	@Override
	public void guardarMensaje(Mensaje mensaje) {
		mensajeRepo.save(mensaje);
	}

}
