package com.curso.java.sincronizacion;

public class Consumidor extends Thread{

	private Monedero monedero;
	
	public Consumidor(Monedero monedero) {
		super();
		this.monedero = monedero;
	}

	@Override
	public void run() {

		while (true) {
			
			try {
				Thread.sleep(1000);
				String moneda = monedero.sacarMoneda();
				
				System.out.println("Se ha sacado: " + moneda);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
