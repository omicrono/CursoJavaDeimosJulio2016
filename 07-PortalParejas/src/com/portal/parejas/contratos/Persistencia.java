package com.portal.parejas.contratos;

import java.util.List;

import com.portal.parejas.entidades.Persona;

public interface Persistencia {

	int insertar(Persona persona);
	
	Persona consultarPorNombreYPassword(String nombre, String password);
	
	/**
	 * Metodo que consulta en el entrono de persistencia y retorna todos
	 * los registros de tipo persona
	 * 
	 * @return Todos los usuarios del entorno de persistencia 
	 */
	List<Persona> consultarTodos();
	
}
