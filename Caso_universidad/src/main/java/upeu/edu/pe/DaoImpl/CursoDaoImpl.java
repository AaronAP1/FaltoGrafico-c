package upeu.edu.pe.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import upeu.edu.pe.Dao.*;
import upeu.edu.pe.Entity.curso;

public class CursoDaoImpl implements Operaciones<curso> {
	
	@Autowired
	private JdbcTemplate progra;

	@Override
	public int create(curso t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(curso t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public curso read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<curso> reaAll() {
		// TODO Auto-generated method stub
		String SQL ="SELECT * FROM universidad.curso_escolar";
		return progra.query(SQL, BeanPropertyRowMapper.newInstance(curso.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL ="SELECT * FROM universidad.curso_escolar";
		return progra.queryForList(SQL);
	}

}
