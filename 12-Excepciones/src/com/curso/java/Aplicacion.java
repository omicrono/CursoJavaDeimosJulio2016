package com.curso.java;

public class Aplicacion {

	public static void main(String[] args){
	
		Algoritmo algoritmo = new Algoritmo();
		
		try {
			algoritmo.metodo(false);
			
			
			
			
		} catch (MiPropiaException e) {
			//Dejar traza en el log
			e.printStackTrace();
			//Avisar al que invoco
			System.out.println("Se ha producido un error");
			
			throw new RuntimeException(e);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			//Se utiliza pra liberar recursos
			System.out.println("Quiero que se ejecute hay execption o no");
		}
		
		
		System.out.println("No se ejecuta");
		

	}

}
