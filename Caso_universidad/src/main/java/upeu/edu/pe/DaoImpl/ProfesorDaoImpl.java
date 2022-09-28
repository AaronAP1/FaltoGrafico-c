package upeu.edu.pe.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import upeu.edu.pe.Dao.Operaciones;
import upeu.edu.pe.Entity.profesor;

public class ProfesorDaoImpl implements Operaciones<profesor>  {
	
	@Autowired
	private JdbcTemplate Castillo;

	@Override
	public int create(profesor t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(profesor t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public profesor read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<profesor> reaAll() {
		// TODO Auto-generated method stub
		String SQL="SELECT * FROM universidad.profesor";
		return Castillo.query(SQL, BeanPropertyRowMapper.newInstance(profesor.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL="SELECT * FROM universidad.profesor";
		return Castillo.queryForList(SQL);
	}

}
