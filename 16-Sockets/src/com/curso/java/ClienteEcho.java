package com.curso.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClienteEcho {

	public static void main(String[] args) throws UnknownHostException, IOException {

		try (Socket referenciaServidor = new Socket("localhost", 4444);
				OutputStreamWriter osw = new OutputStreamWriter(referenciaServidor.getOutputStream());
				BufferedReader br = new BufferedReader(new InputStreamReader(referenciaServidor.getInputStream()));){
			
			System.out.println("Cliente: Echo");
			
			osw.write("Echo \n");
			
			osw.flush();
			
			String lineRetornadaPorElServidor = br.readLine();
			
			System.out.println("Servidor: " + lineRetornadaPorElServidor);
			
			System.out.println("Cliente: Echo Echo");
			
			osw.write("Echo Echo \n");
			
			osw.flush();
			
			lineRetornadaPorElServidor = br.readLine();
			
			System.out.println("Servidor: " + lineRetornadaPorElServidor);
			
		}
	}

}
