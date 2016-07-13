package com.curso.java.factoria.abstracta;

public class Factoria {

	public interface Mercedes {

	}

	public Mercedes getCoche(String modelo){
		switch (modelo) {
		case "SerieE":
			return new SerieE();
		default:
			return null;
		}
	}
	
	private class SerieE implements Mercedes{
		
	}
	
}
