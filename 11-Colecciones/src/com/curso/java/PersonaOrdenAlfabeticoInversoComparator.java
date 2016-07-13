package com.curso.java;

import java.util.Comparator;

public class PersonaOrdenAlfabeticoInversoComparator implements Comparator<Persona> {

	@Override
	public int compare(Persona arg0, Persona arg1) {
		return arg1.getNombre().compareTo(arg0.getNombre());
	}

}
