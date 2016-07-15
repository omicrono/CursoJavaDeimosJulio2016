package com.curso.java.serializacion;

import java.io.Serializable;

public class Direccion implements Serializable {
	private static final long serialVersionUID = 1L;

	private String calle;
	private String ciudad;
	private int numero;
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Direccion() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Direccion(String calle, String ciudad, int numero) {
		super();
		this.calle = calle;
		this.ciudad = ciudad;
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Direccion [calle=" + calle + ", ciudad=" + ciudad + ", numero=" + numero + "]";
	}

	
	
}
