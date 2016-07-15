package com.curso.java.sincronizacion;

public class Aplicacion {

	public static void main(String[] args) {

		//Recurso compartido por dos hilos
		Monedero monedero = new Monedero();
		
		Productor productor = new Productor(monedero);
		Consumidor consumidor = new Consumidor(monedero);
		
		productor.start();
		consumidor.start();
		
		
	}

}
