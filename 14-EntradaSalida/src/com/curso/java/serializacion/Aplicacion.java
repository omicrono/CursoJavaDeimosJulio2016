package com.curso.java.serializacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class Aplicacion {
	private static final String PATH = "datos.bin";

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		try (OutputStream fos = new FileOutputStream(PATH);) {
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			Object obj = new Persona("victor", 22, new Direccion("mayor", "Valladolid", 1));
			oos.writeObject(obj);

			oos.flush();
		}

		try(FileInputStream fis = new FileInputStream(PATH);){
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Persona miPersona = (Persona) ois.readObject();
			
			System.out.println(miPersona);
		}
		
	}
}
