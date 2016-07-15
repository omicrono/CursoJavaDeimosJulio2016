package com.curso.java;

import java.util.LinkedList;
import java.util.List;

public class Boton implements Clickable {

	private List<OnClickListener> listeners= new LinkedList<>();
	
	private String text;
	
	/* (non-Javadoc)
	 * @see com.curso.java.Clickable#click()
	 */
	@Override
	public void click(){
		// TODO Hacer el efecto visual de que el boton se oprime
		
		//Crear el evento
		ClickEvent evento = new ClickEvent(this);
		//Dispare el evento
		for (OnClickListener listener : listeners) {
			
			listener.onClick(evento);
		}
	}
	
	public void addOnClickListener(OnClickListener listener){
		listeners.add(listener);
	}
	
	public void removeOnClickListener(OnClickListener listener){
		listeners.remove(listener);
	}
	
}
