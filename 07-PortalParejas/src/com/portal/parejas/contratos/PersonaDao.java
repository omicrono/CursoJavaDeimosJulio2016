package com.portal.parejas.contratos;

import java.sql.SQLException;
import java.util.List;

import com.portal.parejas.entidades.Persona;

public interface PersonaDao {

	int insertar(Persona persona) throws SQLException;
	
	Persona consultarPorNombreYPassword(String nombre, String password) throws SQLException;
	
	/**
	 * Metodo que consulta en el entrono de persistencia y retorna todos
	 * los registros de tipo persona
	 * 
	 * @return Todos los usuarios del entorno de persistencia 
	 * @throws SQLException 
	 */
	List<Persona> consultarTodos() throws SQLException;
	
}
