package com.curso.java;

public abstract class Persona {

	private String nombre;
	
	//Constructor
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public abstract void setNombre(String nombre);

	
	
}
