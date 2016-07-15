import java.sql.SQLException;
import java.util.List;

import com.portal.parejas.entidades.Persona;
import com.portal.parejas.persistencia.PersonaJdbcDao;
import com.portal.parejas.transacciones.GestorTransacional;

public class TestPersonaJdbcDao {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Persona persona = new Persona(6, "victor", "victor", 22, 1.80, 'H');
		
		
		PersonaJdbcDao personaJdbcDao = new PersonaJdbcDao();
		
		GestorTransacional gestorTransacional = new GestorTransacional();
		
		gestorTransacional.createConnection();
		
		personaJdbcDao.setGestorTransaccional(gestorTransacional);

		try {
			personaJdbcDao.insertar(persona);
			
			Persona persona2 = personaJdbcDao.consultarPorNombreYPassword("victor", "victor");
			
			System.out.println(persona2.getId());
			
			List<Persona> todos = personaJdbcDao.consultarTodos();
			
			for (Persona persona3 : todos) {
				System.out.println(persona3.getNombre() + ", " + persona3.getId());
			}
			
			gestorTransacional.getCurrentConnection().commit();
		} catch (SQLException e) {
			gestorTransacional.getCurrentConnection().rollback();;
		} finally {
			gestorTransacional.closeConnection();
		}

	}

}
