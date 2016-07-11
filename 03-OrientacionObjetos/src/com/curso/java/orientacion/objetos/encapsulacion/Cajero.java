package com.curso.java.orientacion.objetos.encapsulacion;

public class Cajero {

	public void cobrar(Viejecita viajecita){
		viajecita.monedero = 0;
		
		if (viajecita.pagar(50) != -1){
			System.out.println("Entragamos la compra");
		}
	}
	
	public void cobrar(Jovencita jovencita){
		//jovencita.monedero = 0;
		
		jovencita.setNombre("Jaime");
		
		if (jovencita.pagar(50) != -1){
			System.out.println("Entragamos la compra");
		}
	}
	
}
