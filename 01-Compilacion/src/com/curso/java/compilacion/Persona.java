package com.curso.java.compilacion;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Persona{
	public String nombre;

	@Override
	public String toString() {

		ToStringBuilder toStringBuilder = new ToStringBuilder(this);
		
		toStringBuilder.append(this.nombre);
		
		return toStringBuilder.toString();
	}
}
