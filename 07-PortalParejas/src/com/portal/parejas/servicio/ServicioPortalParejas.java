package com.portal.parejas.servicio;

import java.util.LinkedList;
import java.util.List;

import com.portal.parejas.contratos.Negocio;
import com.portal.parejas.contratos.PersonaDao;
import com.portal.parejas.contratos.Servicio;
import com.portal.parejas.entidades.Persona;

public class ServicioPortalParejas implements Servicio {

	// Dependencias
	private PersonaDao persistencia = null;
	private Negocio negocio = null;

	// Inyeccion por setter
	public void setPersistencia(PersonaDao persistencia) {
		this.persistencia = persistencia;
	}

	public void setNegocio(Negocio negocio) {
		this.negocio = negocio;
	}

	// Inyeccion por constructor
	public ServicioPortalParejas(PersonaDao persistencia, Negocio negocio) {
		super();
		this.persistencia = persistencia;
		this.negocio = negocio;
	}

	@Override
	public int alta(Persona persona) {
		// Dara de alta el nuevo usuario de la aplicacion (BD)
		int clave = persistencia.insertar(persona);
		// Se le enviara un correo electronico de bienvenida
		negocio.envioCorreoElectronico(new Persona(), persona);
		return clave;
	}

	@Override
	public Persona login(String nombre, String password) {
		return persistencia.consultarPorNombreYPassword(nombre, password);
	}

	@Override
	public List<Persona> buscarAfines(Persona elQueBusca) {
		// Listado de Afines
		List<Persona> afines = new LinkedList<>();

		// Obtener todos los candidatos
		List<Persona> candidatos = persistencia.consultarTodos();

		for (Persona candidato : candidatos) {
			if (negocio.esAfin(elQueBusca, candidato)) {
				afines.add(candidato);
			}
		}

		return afines;
	}

	@Override
	public Persona buscarIdeal(Persona elQueBusca) {
		// Obtener todos los candidatos
		List<Persona> candidatos = persistencia.consultarTodos();

		for (Persona candidato : candidatos) {
			if (negocio.esIdeal(elQueBusca, candidato)) {
				return candidato;
			}
		}
		
		return null;
	}
}
