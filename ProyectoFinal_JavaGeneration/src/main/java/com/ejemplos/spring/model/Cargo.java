package com.ejemplos.spring.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ejemplos.spring.service.CargoService;
import com.ejemplos.spring.service.EmpleadoService;

/**
 * Clase Cargo. Se especifican sus atributos y metodos correspondientes
 * 
 * @author Javier, Noemí, Óscar, Silvia, Usoa
 * @version 1.0
 */

@Entity
@Table(name = "cargos")
public class Cargo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcargo")
	private int id;
	private String cargo;
	public Cargo() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	@Override
	public String toString() {
		return "Cargo [id=" + id + ", cargo=" + cargo + "]";
	}

	
	
	
	
}