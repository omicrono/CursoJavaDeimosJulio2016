package com.portal.parejas.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import com.portal.parejas.contratos.PersonaDao;
import com.portal.parejas.entidades.Persona;
import com.portal.parejas.transacciones.GestorTransacional;
import com.portal.parejas.transacciones.Transaccionable;

public class PersonaJdbcDao implements PersonaDao, Transaccionable {

	private GestorTransacional gs;

	private final static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);

	private static final String INSERT_SQL = "INSERT INTO PORTALPAREJAS.PERSONAS (id, nombre, password, edad, altura, genero) VALUES (?, ?, ?, ?, ?, ?)";

	private static final String CONSULTA_NOMBRE_Y_PASSWORD_SQL = "SELECT * FROM PORTALPAREJAS.PERSONAS WHERE nombre = ? AND password = ?";

	private static final String CONSULTA_TODOS_SQL = "SELECT * FROM PORTALPAREJAS.PERSONAS";

	@Override
	public int insertar(Persona persona) throws SQLException {

		logger.log(Level.INFO, "Se va a insertar una nueva Persona");

		Connection connection = gs.getCurrentConnection();

		// 3-Preparamos la sentencia SQL
		PreparedStatement prepareStatement = connection.prepareStatement(INSERT_SQL);

		// Mapping de Objeto a SQL (relacion)
		prepareStatement.setInt(1, persona.getId());
		prepareStatement.setString(2, persona.getNombre());
		prepareStatement.setString(3, persona.getPassword());
		prepareStatement.setInt(4, persona.getEdad());
		prepareStatement.setDouble(5, persona.getAltura());
		prepareStatement.setString(6, String.valueOf(persona.getSexo()));

		prepareStatement.executeUpdate();

		return persona.getId();
	}

	@Override
	public Persona consultarPorNombreYPassword(String nombre, String password) throws SQLException {

		logger.log(Level.INFO, "Se va a consultar por nombre y password: " + nombre + ", " + password);

		Connection connection = gs.getCurrentConnection();

		// 3-Preparamos la sentencia SQL
		PreparedStatement prepareStatement = connection.prepareStatement(CONSULTA_NOMBRE_Y_PASSWORD_SQL,
				ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

		// Mapping de Objeto a SQL (relacion)
		prepareStatement.setString(1, nombre);
		prepareStatement.setString(2, password);

		ResultSet rs = prepareStatement.executeQuery();

		if (rs.first()) {
			Persona persona = new Persona(rs.getInt("id"), rs.getString("nombre"), rs.getString("password"),
					rs.getInt("edad"), rs.getDouble("altura"), rs.getString("genero").charAt(0));
			return persona;
		} else {
			return null;
		}

	}

	@Override
	public List<Persona> consultarTodos() throws SQLException {
		logger.log(Level.INFO, "Se va a consultar todas las personas");

		List<Persona> resultado = new LinkedList<>();

		Connection connection = gs.getCurrentConnection();

		// 3-Preparamos la sentencia SQL
		PreparedStatement prepareStatement = connection.prepareStatement(CONSULTA_TODOS_SQL,
				ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);

		ResultSet rs = prepareStatement.executeQuery();

		if (rs.first()) {
			do {
				Persona persona = new Persona(rs.getInt("id"), rs.getString("nombre"), rs.getString("password"),
						rs.getInt("edad"), rs.getDouble("altura"), rs.getString("genero").charAt(0));
				resultado.add(persona);
			} while (rs.next());

		}

		return resultado;
	}

	@Override
	public GestorTransacional getGestorTransaccional() {
		return gs;
	}

	@Override
	public void setGestorTransaccional(GestorTransacional gs) {
		this.gs = gs;
	}

}
