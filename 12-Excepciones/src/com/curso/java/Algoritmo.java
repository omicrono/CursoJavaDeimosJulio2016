package com.curso.java;

public class Algoritmo {

	public void metodo(boolean estado) throws MiPropiaException {

		if(!estado){
			throw new MiPropiaException("Mensaje generado cuando se genera la excepcion");
		}
		
		
		System.out.println("Se jecuto el algoritmo correctamente");

	}
	
	
}
