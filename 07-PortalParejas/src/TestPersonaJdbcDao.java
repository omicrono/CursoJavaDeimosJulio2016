import java.util.List;

import com.portal.parejas.entidades.Persona;
import com.portal.parejas.persistencia.PersonaJdbcDao;

public class TestPersonaJdbcDao {

	public static void main(String[] args) {

		PersonaJdbcDao personaJdbcDao = new PersonaJdbcDao();
		
		Persona persona = new Persona(5, "victor", "victor", 22, 1.80, 'H');
		personaJdbcDao.insertar(persona);
		
		Persona persona2 = personaJdbcDao.consultarPorNombreYPassword("victor", "victor");
		
		System.out.println(persona2.getId());
		
		List<Persona> todos = personaJdbcDao.consultarTodos();
		
		for (Persona persona3 : todos) {
			System.out.println(persona3.getNombre() + ", " + persona3.getId());
		}

	}

}
