package com.curso.java.orientacion.objetos.sobreescritura;

public class Persona {

	public String nombre;
	
	@Override
	public String toString() {
		return "Persona[" + this.nombre + "]";
	}
	
}
