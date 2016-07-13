package com.curso.java;

public class Persona implements Comparable<Persona> {

	private int id;
	private String nombre;
	
	public Persona(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [id=" + getId() + ", nombre=" + getNombre() + "]";
	}

	//Algoritmo de ordenacion por defecto, que es por orden alfabetico del nombre
	
	@Override
	public int compareTo(Persona arg0) {
		return this.getNombre().compareTo(arg0.nombre);
	}
	
	
}
