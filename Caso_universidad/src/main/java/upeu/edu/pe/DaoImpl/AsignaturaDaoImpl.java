package upeu.edu.pe.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.Dao.Operaciones;
import upeu.edu.pe.Entity.asignatura;

@Component
public class AsignaturaDaoImpl implements Operaciones<asignatura> {
	
	@Autowired
	private JdbcTemplate asig;

	@Override
	public int create(asignatura t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(asignatura t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public asignatura read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<asignatura> reaAll() {
		// TODO Auto-generated method stub
		String SQL ="SELECT * FROM universidad.asignatura";
		return asig.query(SQL, BeanPropertyRowMapper.newInstance(asignatura.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL ="SELECT * FROM asignatura";
		return asig.queryForList(SQL);
	}

}
