package com.ejemplos.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplos.spring.model.Empleado;
import com.ejemplos.spring.service.CargoService;
import com.ejemplos.spring.service.EmpleadoService;

/**
 * Clase EmpleadoRepository. Se encarga de llamar a metodos como guardar, eliminar, etc 
 * 
 * @author Javier, Noemí, Óscar, Silvia, Usoa
 * @version 1.0
 */
@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Integer> {

}
