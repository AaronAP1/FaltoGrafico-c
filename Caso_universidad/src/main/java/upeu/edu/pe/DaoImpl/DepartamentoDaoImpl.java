package upeu.edu.pe.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import upeu.edu.pe.Dao.*;
import upeu.edu.pe.Entity.departamento;
public class DepartamentoDaoImpl implements Operaciones<departamento> {
	@Autowired
	private JdbcTemplate depa;

	@Override
	public int create(departamento t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(departamento t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public departamento read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<departamento> reaAll() {
		// TODO Auto-generated method stub
		String SQL ="SELECT * FROM universidad.departamento";
		return depa.query(SQL, BeanPropertyRowMapper.newInstance(departamento.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL ="SELECT * FROM universidad.departamento";
		return depa.queryForList(SQL);
	}

}
