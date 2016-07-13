package com.curso.java.clase.interna.anonima;

public class Aplicacion {

	public interface OnClickListener{
		void click();
	}
	
	
	public static void main(String[] args) {
		Boton boton = new Aplicacion.Boton();
		
		
		//Clase interna y anonima
		boton.addOnClickListener(new OnClickListener() {
			@Override
			public void click() {
				// TODO Auto-generated method stub
				
			}
		});

	}
	
	public static class Boton{
		public void addOnClickListener(OnClickListener listener){
			
		}
	}

}
