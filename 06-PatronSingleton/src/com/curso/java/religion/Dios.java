package com.curso.java.religion;

public class Dios {

	private static Dios instance = new Dios();
	
	private Dios() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static Dios getInstance(){
		return instance;
	}
	
}
