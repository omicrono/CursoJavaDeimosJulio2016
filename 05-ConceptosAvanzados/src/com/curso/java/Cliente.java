package com.curso.java;

import java.io.Serializable;

public class Cliente extends Persona implements Pagador, Serializable {

	public Cliente(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pagar() {
		// TODO Auto-generated method stub
		System.out.println("Este cliente paga robando en la calle");
	}
	
	

}
