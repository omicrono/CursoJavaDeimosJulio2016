package com.curso.java.ejercicio.orientacion.objetos;

public class Coche extends Vehiculo {
	
	private int potencia;
	
	@Override
	public void mover(int cantidad) {
		System.out.println("Se está movindo un Coche: " + cantidad);
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

}
