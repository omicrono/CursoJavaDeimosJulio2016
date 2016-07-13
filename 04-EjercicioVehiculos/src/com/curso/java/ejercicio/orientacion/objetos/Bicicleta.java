package com.curso.java.ejercicio.orientacion.objetos;

public class Bicicleta extends Vehiculo {

	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public void mover(int cantidad) {
		System.out.println("Se está moviendo una bicicleta: " + cantidad);
	}
	
	public void hacerCaballito(){
		
	}
	
}
