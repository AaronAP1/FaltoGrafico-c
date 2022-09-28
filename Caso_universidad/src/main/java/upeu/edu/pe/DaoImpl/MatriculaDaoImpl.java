package upeu.edu.pe.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import upeu.edu.pe.Dao.*;
import upeu.edu.pe.Entity.matricula;

public class MatriculaDaoImpl implements Operaciones<matricula> {
	
	@Autowired
	private JdbcTemplate matri;

	@Override
	public int create(matricula t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(matricula t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public matricula read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<matricula> reaAll() {
		// TODO Auto-generated method stub
		String SQL="SELECT * FROM universidad.alumno_se_matricula_asignatura";
		return matri.query(SQL, BeanPropertyRowMapper.newInstance( matricula.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL="SELECT * FROM universidad.alumno_se_matricula_asignatura";
		return matri.queryForList(SQL);
	}

}
