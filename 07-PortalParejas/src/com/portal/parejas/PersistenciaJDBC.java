package com.portal.parejas;

import java.util.List;

import com.portal.parejas.contratos.Persistencia;
import com.portal.parejas.entidades.Persona;

public class PersistenciaJDBC implements Persistencia {

	@Override
	public int insertar(Persona persona) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Persona consultarPorNombreYPassword(String nombre, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Persona> consultarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
