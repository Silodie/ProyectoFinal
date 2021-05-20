package com.ejemplos.spring.model;

import com.ejemplos.spring.service.CargoService;
import com.ejemplos.spring.service.EmpleadoService;

/**
 * Clase EmpleadoFalso. Ademas de sus atributos y metodos, crea aleatoriamente datos de empleados
 * 
 * @author Javier, Noemí, Óscar, Silvia, Usoa
 * @version 1.0
 */
public class EmpleadoFalso {

	private int id;
	private String nombre;
	private String apellidos;
	private String resumen;
	private String foto;
	private String cargo;
	private String prefijo;
	private String foto2;

	public EmpleadoFalso() {
	}


	public EmpleadoFalso(int id, String nombre, String apellidos, String resumen, String foto, String cargo,
			String prefijo, String foto2) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.resumen = resumen;
		this.foto = foto;
		this.cargo = cargo;
		this.prefijo = prefijo;
		this.foto2 = foto2;
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

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	

	public String getPrefijo() {
		return prefijo;
	}


	public void setPrefijo(String prefijo) {
		this.prefijo = prefijo;
	}


	public String getFoto2() {
		return foto2;
	}


	public void setFoto2(String foto2) {
		this.foto2 = foto2;
	}


	@Override
	public String toString() {
		return "EmpleadoFalso [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", resumen=" + resumen
				+ ", foto=" + foto + ", cargo=" + cargo + ", prefijo=" + prefijo + ", foto2=" + foto2 + "]";
	}


	



}
