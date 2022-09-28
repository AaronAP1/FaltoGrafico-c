package upeu.edu.pe.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import upeu.edu.pe.Dao.Operaciones;
import upeu.edu.pe.Entity.grado;

public class GradoDaoImpl implements Operaciones<grado> {
	
	
	@Autowired
	private JdbcTemplate gradito;

	@Override
	public int create(grado t) {
		// TODO Auto-generated method stub
		
		
		return 0;
	}

	@Override
	public int update(grado t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public grado read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<grado> reaAll() {
		// TODO Auto-generated method stub
		String SQL="SELECT * FROM universidad.grado";
		return gradito.query(SQL, BeanPropertyRowMapper.newInstance(grado.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		String SQL="SELECT * FROM universidad.grado";
		
		return gradito.queryForList(SQL);
	}

}
