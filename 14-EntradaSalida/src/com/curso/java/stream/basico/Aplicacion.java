package com.curso.java.stream.basico;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class Aplicacion {
	public static void main(String[] args) throws IOException {

		File fichero = new File("copia.jpg");
		
		//Siempre hay que asegurarse de cerrar los streams, en este caso nos aprovechamos de que son Closables
		
		// Si el recurso esta en el raiz del classpath
		try (InputStream is = Aplicacion.class.getClassLoader().getResourceAsStream("imagen.jpg"); 
				FileOutputStream fos = new FileOutputStream(fichero);){

			// Lectura fichero
			// Si el recurso esta dentro de la carpeta
			// "com.curso.java.stream.basico"
			// Aplicacion.class.getResource("imagen.jpg");

			// Lectura byte a byte
			/*
			 * int datoLeido = 0; while((datoLeido = is.read()) != -1){
			 * fos.write(datoLeido); }
			 */

			// Con bucle For
			/*
			 * for(int dato = is.read(); dato != -1; dato = is.read()){
			 * 
			 * }
			 */
			
			// Con Buffer
			byte[] buffer = new byte[1024];
			int numeroDatoLeidoBuffer = 0;
			while ((numeroDatoLeidoBuffer = is.read(buffer)) != -1) {
				// Escritura copia de fichero
				fos.write(buffer, 0, numeroDatoLeidoBuffer);
			}
		}
	}
}
