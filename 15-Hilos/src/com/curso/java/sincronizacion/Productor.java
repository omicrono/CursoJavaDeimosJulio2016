package com.curso.java.sincronizacion;

public class Productor extends Thread {

	private Monedero monedero;

	public Productor(Monedero monedero) {
		super();
		this.monedero = monedero;
	}

	@Override
	public void run() {
		
		while (true) {
			System.out.println("Metiendo una moneda de 1 Euro");
			monedero.meterMoneda("1 Euro");
			
			System.out.println("Metiendo una moneda de 2 Euro");
			monedero.meterMoneda("2 Euro");
			
			System.out.println("Metiendo una moneda de 0,50 Euro");
			monedero.meterMoneda("0,50 Euro");
			
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	
	
}
