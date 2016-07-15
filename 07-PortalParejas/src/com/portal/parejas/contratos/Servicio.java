package com.portal.parejas.contratos;

import java.util.List;

import com.portal.parejas.entidades.Persona;

public interface Servicio {
	
	int alta(Persona persona) throws Exception;
	
	Persona login(String nombre, String password) throws Exception;
	
	/**
	 * 
	 * retorna aquellas personas dadas de alta en la aplicacion (BD), que
	 * cumplan con las reglas de Afinidad.
	 * 
	 * @param elQuebusca
	 * @return
	 * @throws Exception 
	 */
	
	List<Persona> buscarAfines(Persona elQuebusca) throws Exception;
	
	Persona buscarIdeal(Persona elQuebusca) throws Exception;
	
}
