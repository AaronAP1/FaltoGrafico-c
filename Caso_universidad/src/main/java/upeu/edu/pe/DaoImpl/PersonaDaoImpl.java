package upeu.edu.pe.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.Dao.Operaciones;
import upeu.edu.pe.Entity.persona;

@Component
public class PersonaDaoImpl implements Operaciones<persona> {
	
	@Autowired
	private JdbcTemplate people;

	@Override
	public int create(persona t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(persona t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public persona read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<persona> reaAll() {
		// TODO Auto-generated method stub
		String SQL="SELECT * FROM universidad.persona";
		return people.query(SQL, BeanPropertyRowMapper.newInstance(persona.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL="select distinct p.tipo, p.nombre, g.id_grado, a.id_curso_escolar, p.sexo from persona as p\r\n"
				+ "inner join alumno_se_matricula_asignatura as a on p.id = a.id_alumno\r\n"
				+ "join asignatura as g on a.id_asignatura = g.curso;";
		return people.queryForList(SQL);
	}

}
