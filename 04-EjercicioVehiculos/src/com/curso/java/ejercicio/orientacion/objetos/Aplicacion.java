package com.curso.java.ejercicio.orientacion.objetos;

public class Aplicacion {

	public static void main(String[] args) {

		Vehiculo vehiculo = new Vehiculo();
		
		vehiculo.setMarca("Mercedes");
		vehiculo.setColor("Rojo");
		
		System.out.println(vehiculo.toString());
		
		Coche coche = new Coche();
		
		coche.mover();
		
		coche.mover(10);
		
		vehiculo.mover(20);
		
		Bicicleta bicicleta = new Bicicleta();
		
		bicicleta.mover();
		
		bicicleta.hacerCaballito();
		
		vehiculo = bicicleta;
		
		vehiculo.mover();
		
		//vehiculo.hacerCaballito();
		
		
		
	}

}
