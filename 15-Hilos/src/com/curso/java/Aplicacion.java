package com.curso.java;

public class Aplicacion {

	//El metodo run del MainThread
	public static void main(String[] args) {
		
		System.out.println("Empezando hilo principal");
		
		Thread thread1 = new Thread(new Runnable() {
			
			//El metodo run del hilo secundario
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Terminado el hilo primero");
				
			}
		});
		
		Thread thread2 = new Thread(new RunnableSecundario());
		Thread thread3 = new Thread(new RunnableSecundario());
		
		System.out.println("Se han creado todos los objetos que representan los hilos");
		
		//Arrancar los hilos
		thread1.start();
		thread2.start();
		thread3.start();

		//......
		
		System.out.println("Se ha terminado de ejecutar el hilo principal");
	}
	
}
