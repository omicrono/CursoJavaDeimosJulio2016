package com.curso.java.entidades;

import java.io.Serializable;

public class Cliente extends Entidad implements Serializable{

	private String nombre;
	private String password;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
