package com.curso.java.compilacion;

public class HolaMundo {

	public static void main(String[] args) {

		Persona persona = new Persona();
		
		persona.nombre = "Victor";
		
		System.out.println("Hola " + persona.toString() + "!!!!!");
	
	}

}
