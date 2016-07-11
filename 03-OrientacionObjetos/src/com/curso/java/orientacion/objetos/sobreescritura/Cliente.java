package com.curso.java.orientacion.objetos.sobreescritura;

public class Cliente extends Persona{
	
	public String numCuenta;
	
	@Override
	public String toString() {
		return super.toString() + this.numCuenta;
	}

}
