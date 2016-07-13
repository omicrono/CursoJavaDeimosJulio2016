package com.curso.java.ejercicio.orientacion.objetos;

//Herencia

public class Vehiculo extends Object{

	//Encapsulacion
	
	private String color;
	private String marca;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	//Sobrecarga
	
	public void mover(){
		this.mover(1);
	}
	
	public void mover(int cantidad){
		System.out.println("Se esta moviendo un Vehiculo:" + cantidad);
	}
	
	//Sobreescritura
	
	@Override
	public String toString() {
		return "Vehiculo [color=" + color + ", marca=" + marca + "]";
	}	
	
}
