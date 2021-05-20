package com.ejemplos.spring.model;

import javax.persistence.Entity;

import com.ejemplos.spring.service.CargoService;
import com.ejemplos.spring.service.EmpleadoService;

/**
 * Clase Cliente. Especifica sus atributos y metodos correspondientes
 * 
 * @author Javier, Noemí, Óscar, Silvia, Usoa
 * @version 1.0
 */

public class Cliente {
	
	private int id;
	private String nombre;
	private String descripcion;
	private String logo;
	
	public Cliente() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", logo=" + logo + "]";
	}
	
	
	
}