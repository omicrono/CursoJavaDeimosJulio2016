package com.curso.java.orientacion.objetos.encapsulacion;

public class Jovencita {
	
	private String nombre;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private double monedero;
	
	public double pagar(double precio){
		
		if(monedero < precio){
			monedero = monedero - precio;
			return precio;
		} else {
			return -1;
		}
	}
	
	public double pagar(String precio){
		
		double precioParseado = Double.parseDouble(precio);
		
		return this.pagar(precioParseado);
	}
	
	
}
