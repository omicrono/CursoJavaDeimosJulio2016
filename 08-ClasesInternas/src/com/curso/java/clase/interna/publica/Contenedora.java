package com.curso.java.clase.interna.publica;

public class Contenedora {

	private String nombre;
	
	private static class Interna{
		public void otroMetodo(){
			//Contenedora.this.nombre = "";
		}
	}
	
	public void metodo(){
		nombre = "";
		new Interna();
	}
	
}
