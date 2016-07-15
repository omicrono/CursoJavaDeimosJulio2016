package com.curso.java.reader.writer.basico;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Aplicacion {
	private static final String PATH = "datos.txt";

	public static void main(String[] args) throws IOException {

		// Escritura en el fichero
		try (OutputStream fos = new FileOutputStream(PATH);) {
			OutputStreamWriter writer = new OutputStreamWriter(fos);

			writer.write("Este es el texto que se quiere añadir al fichero");
			
			writer.flush();
		}

		// Lectura del fichero
		try(InputStream fis = new FileInputStream(PATH);){
			InputStreamReader reader = new InputStreamReader(fis);
			
			BufferedReader br = new BufferedReader(reader);
			
			String line = br.readLine();
			
			System.out.println(line);
			
		}

	}
}
