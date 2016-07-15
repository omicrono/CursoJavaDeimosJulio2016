package com.portal.parejas.transacciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestorTransacional {

	private static final String CADENA_CONEXION = "jdbc:derby://localhost:1527/parejas;create=true";
	
	private static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";

	private Connection connection;
	
	public GestorTransacional() throws ClassNotFoundException {
		Class.forName(DRIVER);
		
	}

	public void createConnection() throws SQLException{
		connection = DriverManager.getConnection(CADENA_CONEXION, "admin", "admin");
		connection.setAutoCommit(false);
	}
	
	public Connection getCurrentConnection() {
		return connection;
	}
	
	public void closeConnection() throws SQLException {
		connection.close();
	}
	
}
