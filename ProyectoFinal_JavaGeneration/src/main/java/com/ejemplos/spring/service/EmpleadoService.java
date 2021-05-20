package com.ejemplos.spring.service;

import java.util.List;

import com.ejemplos.spring.model.Empleado;

/**
 * Interfaz EmpleadoService 
 * 
 * @author Javier, Noemí, Óscar, Silvia, Usoa
 * @version 1.0
 */
public interface EmpleadoService {

	//Metodo que muestra un listado de los integrantes del equipo de la empresa al Gestor
	public List<Empleado> listarEquipoAdmin();
	
	//Metodo que muestra un listado de los integrantes del equipo de la empresa al Usuario
	public List<Empleado> listarEquipo();
	
	//Metodo para guardar un nuevo empleado
	public void guardarEmpleado(Empleado empleado);
	
	//Metodo para editar un empleado
	public Empleado editarEmpleado(int id);
	
	//Metodo para eliminar un empleado por id
	public void eliminarEmpleado(int id);
}
