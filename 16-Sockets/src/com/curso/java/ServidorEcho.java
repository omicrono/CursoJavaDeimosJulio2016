package com.curso.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorEcho {

	public static void main(String[] args) throws IOException {

		ServerSocket serverSocket = new ServerSocket(4444);

		try (Socket referenciaCliente = serverSocket.accept();
				OutputStreamWriter osw = new OutputStreamWriter(referenciaCliente.getOutputStream());
				BufferedReader br = new BufferedReader(new InputStreamReader(referenciaCliente.getInputStream()));) {

			String loQueEnviaElCliente = br.readLine();

			System.out.println(loQueEnviaElCliente);

			osw.write(loQueEnviaElCliente + "\n");

			osw.flush();

		}

	}

}
