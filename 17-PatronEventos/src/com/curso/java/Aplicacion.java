package com.curso.java;

public class Aplicacion {

	public static void main(String[] args) {
		
		Boton botonLanzarMisiles = new Boton();
		
		Boton botonHolaMundo = new Boton();

		System.out.println("Se clickan los botones sin Listener");
		
		botonLanzarMisiles.click();
		
		botonHolaMundo.click();
		
		System.out.println("No ha sucedido nada");
		
		OnClickListener listenerLanzarMisilNuclear = new OnClickListener() {
			
			@Override
			public void onClick(ClickEvent event) {
				System.out.println("Se esta lanzando un misil nuclear");
				
			}
		};
		
		botonLanzarMisiles.addOnClickListener(listenerLanzarMisilNuclear);
		
		botonHolaMundo.addOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(ClickEvent event) {
				System.out.println("Hola Mundo!!!!");
				
			}
		});
		
		System.out.println("Se clickan los botones con Listener");
		
		botonLanzarMisiles.click();
		
		botonHolaMundo.click();
		
		botonLanzarMisiles.removeOnClickListener(listenerLanzarMisilNuclear);

		System.out.println("Se clickan los botones habiendo desregistrado el Listener de los misiles");
		
		botonLanzarMisiles.click();
		
		botonHolaMundo.click();
		
		System.out.println("Se clickan los botones habiendo registrado el listener de misiles en el boton HolaMundo");
		
		botonHolaMundo.addOnClickListener(listenerLanzarMisilNuclear);
		
		botonHolaMundo.click();
		
		botonHolaMundo.addOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(ClickEvent event) {
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("Se ha terminado de procesar la tarea asociada al boton hola mundo");
					}
				}).start();
				
			}
		});
		
		botonHolaMundo.click();
		
		System.out.println("El hilo principal no se ha bloqueado");
		
		
	}

}
