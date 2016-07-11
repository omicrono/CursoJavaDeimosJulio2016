package com.curso.java.orientacion.objetos.encapsulacion;

public class Viejecita {
	public double monedero;
	
	public double pagar(double precio){
		
		if(monedero < precio){
			monedero = monedero - precio;
			return precio;
		} else {
			return -1;
		}
	}
}
