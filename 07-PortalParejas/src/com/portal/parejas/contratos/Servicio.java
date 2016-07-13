package com.portal.parejas.contratos;

import java.util.List;

import com.portal.parejas.entidades.Persona;

public interface Servicio {
	
	int alta(Persona persona);
	
	Persona login(String nombre, String password);
	
	/**
	 * 
	 * retorna aquellas personas dadas de alta en la aplicacion (BD), que
	 * cumplan con las reglas de Afinidad.
	 * 
	 * @param elQuebusca
	 * @return
	 */
	
	List<Persona> buscarAfines(Persona elQuebusca);
	
	Persona buscarIdeal(Persona elQuebusca);
	
}
