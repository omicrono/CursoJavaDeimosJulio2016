package com.portal.parejas.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
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

public class PersonaJdbcDao implements PersonaDao {
	
	//private final static Logger logger = LogManager.getLogManager().getLogger(PersonaJdbcDao.class.getName());
	private final static Logger logger = LogManager.getLogManager().getLogger(Logger.GLOBAL_LOGGER_NAME);

	private static final String CADENA_CONEXION = "jdbc:derby://localhost:1527/parejas;create=true";
	
	private static final String DRIVER = "org.apache.derby.jdbc.ClientDriver";

	private static final String INSERT_SQL = "INSERT INTO PORTALPAREJAS.PERSONAS (id, nombre, password, edad, altura, genero) VALUES (?, ?, ?, ?, ?, ?)";

	private static final String CONSULTA_NOMBRE_Y_PASSWORD_SQL = "SELECT * FROM PORTALPAREJAS.PERSONAS WHERE nombre = ? AND password = ?";

	private static final String CONSULTA_TODOS_SQL = "SELECT * FROM PORTALPAREJAS.PERSONAS";
	
	@Override
	public int insertar(Persona persona) {
		
		logger.log(Level.INFO, "Se va a insertar una nueva Persona");
		
		try {
			//1- Cargar la clase en la memoria (solo es necesario hace runa vez)
			Class.forName(DRIVER);
			//2-Obtener la conexion
			try(Connection connection = DriverManager.getConnection(CADENA_CONEXION, "admin", "admin")){
				
				//3-Preparamos la sentencia SQL
				PreparedStatement prepareStatement = connection.prepareStatement(INSERT_SQL);
				
				//Mapping de Objeto a SQL (relacion)
				prepareStatement.setInt(1, persona.getId());
				prepareStatement.setString(2, persona.getNombre());
				prepareStatement.setString(3, persona.getPassword());
				prepareStatement.setInt(4, persona.getEdad());
				prepareStatement.setDouble(5, persona.getAltura());
				prepareStatement.setString(6, String.valueOf(persona.getSexo()));
				
				prepareStatement.executeUpdate();
			}
		} catch (Exception e) {
			//Para que no se lance esta excepcion, ha de estar presente el driver (jar) en el classpath
			//y debe estar bien escrita la clase del Driver
			
			logger.log(Level.SEVERE, e.getMessage(), e);
			
			// Como la interface no declara la posibilidad de que las implementaciones lancen
			//excepciones, no se pueden lanzar excepciones cached, asi que la transformamos en una
			//uncached.
			throw new RuntimeException(e);
		}
		
		return persona.getId();
	}

	@Override
	public Persona consultarPorNombreYPassword(String nombre, String password) {
		
		logger.log(Level.INFO, "Se va a consultar por nombre y password: " + nombre + ", " + password);
		
		try {
			//1- Cargar la clase en la memoria (solo es necesario hace runa vez)
			Class.forName(DRIVER);
			//2-Obtener la conexion
			try(Connection connection = DriverManager.getConnection(CADENA_CONEXION, "admin", "admin")){
				
				//3-Preparamos la sentencia SQL
				PreparedStatement prepareStatement = connection.prepareStatement(CONSULTA_NOMBRE_Y_PASSWORD_SQL, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
				
				//Mapping de Objeto a SQL (relacion)
				prepareStatement.setString(1, nombre);
				prepareStatement.setString(2, password);
				
				ResultSet rs = prepareStatement.executeQuery();
				
			
				if (rs.first()){
					Persona persona = new Persona(					
							rs.getInt("id"),
							rs.getString("nombre"),
							rs.getString("password"),
							rs.getInt("edad"),
							rs.getDouble("altura"),
							rs.getString("genero").charAt(0));
					return persona;
				}
				
			}
		} catch (Exception e) {
			//Para que no se lance esta excepcion, ha de estar presente el driver (jar) en el classpath
			//y debe estar bien escrita la clase del Driver
			
			logger.log(Level.SEVERE, e.getMessage(), e);
			
			// Como la interface no declara la posibilidad de que las implementaciones lancen
			//excepciones, no se pueden lanzar excepciones cached, asi que la transformamos en una
			//uncached.
			throw new RuntimeException(e);
		}

		return null;
	}

	@Override
	public List<Persona> consultarTodos() {
		logger.log(Level.INFO, "Se va a consultar todas las personas");
		
		List<Persona> resultado =  new LinkedList<>();
		
		try {
			//1- Cargar la clase en la memoria (solo es necesario hace runa vez)
			Class.forName(DRIVER);
			//2-Obtener la conexion
			try(Connection connection = DriverManager.getConnection(CADENA_CONEXION, "admin", "admin")){
				
				//3-Preparamos la sentencia SQL
				PreparedStatement prepareStatement = connection.prepareStatement(CONSULTA_TODOS_SQL, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
				
				ResultSet rs = prepareStatement.executeQuery();
				
				if (rs.first()){
					do {
						Persona persona = new Persona(rs.getInt("id"), rs.getString("nombre"), rs.getString("password"),
								rs.getInt("edad"), rs.getDouble("altura"), rs.getString("genero").charAt(0));
						resultado.add(persona);
					} while (rs.next());
					
				}
				
				
			}
		} catch (Exception e) {
			//Para que no se lance esta excepcion, ha de estar presente el driver (jar) en el classpath
			//y debe estar bien escrita la clase del Driver
			
			logger.log(Level.SEVERE, e.getMessage(), e);
			
			// Como la interface no declara la posibilidad de que las implementaciones lancen
			//excepciones, no se pueden lanzar excepciones cached, asi que la transformamos en una
			//uncached.
			throw new RuntimeException(e);
		}

		return resultado;
	}

}
