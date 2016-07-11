package com.curso.java.casting;

public class Programa {

	public static void main(String[] args) {
		
		Persona persona = new Persona();
		
		persona.toString();
		
		//No se puede hacer
		//Cliente cliente = persona;
		
		Cliente cliente2 = new Cliente();
		
		cliente2.toString();
		
		cliente2.nombre = "Juan";
		cliente2.numCuenta = "123";
		
		persona = cliente2;
		
		persona.nombre = "Victor";
		//No hay visibilidad
		//persona.numCuenta = "2345";
		
		Trabajador trabajador = new Trabajador();
		
		persona = trabajador;
		
		if(persona instanceof Cliente){
			cliente2 = (Cliente) persona;
		}
		
		
		
		
		
		
		
		
		
	}

}
