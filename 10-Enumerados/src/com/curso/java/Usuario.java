package com.curso.java;

public class Usuario {

	private String nombre;
	private Color colorFondo;
	
	private void metodo() {
	
		colorFondo = Color.Azul;
		
		colorFondo.getRgb();
		
		String hsl = colorFondo.getHsl();
		
		colorFondo.valueOf("Azul");

	}
	
}
