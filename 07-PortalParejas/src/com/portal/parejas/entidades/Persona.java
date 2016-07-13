package com.portal.parejas.entidades;

public class Persona {

	private int id;
	private String nombre;
	private String password;
	private int edad;
	private double altura;
	private char sexo;
	
	public Persona() {
		super();
	}
	
	public Persona(int id, String nombre, String password, int edad, double altura, char sexo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.password = password;
		this.edad = edad;
		this.altura = altura;
		this.sexo = sexo;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	
}
