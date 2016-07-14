package com.curso.java.persistencia;

import com.curso.java.entidades.Cliente;

public interface ClienteDao extends Dao<Cliente> {
	
	Cliente consultarPorNombre(String nombre);
	
}
