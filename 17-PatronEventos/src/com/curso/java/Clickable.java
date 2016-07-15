package com.curso.java;

public interface Clickable {

	void click();
	
	void addOnClickListener(OnClickListener listener);
	
	void removeOnClickListener(OnClickListener listener);

}