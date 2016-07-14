package com.curso.java.entidades;

import java.io.Serializable;

public class Factura extends Entidad implements Serializable {
	private int cuantia;

	public int getCuantia() {
		return cuantia;
	}

	public void setCuantia(int cuantia) {
		this.cuantia = cuantia;
	}
	
	
}
