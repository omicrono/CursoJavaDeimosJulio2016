package com.curso.java.sincronizacion;

import java.util.Deque;
import java.util.LinkedList;

public class Monedero {

	// Lo hago privado porque quiero controlar como se accede a las monedas
	private Deque<String> bolsilloMonedas = new LinkedList<>();

	public synchronized void meterMoneda(String moneda) {
		bolsilloMonedas.add(moneda);

		notify();
	}

	public String sacarMoneda() throws InterruptedException {
		synchronized (this) {

			if (bolsilloMonedas.size() <= 0) {
				wait();
			}

			return bolsilloMonedas.pop();
		}
	}

}
