package upeu.edu.pe.Services;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.Dao.Operaciones;
import upeu.edu.pe.Entity.asignatura;
import upeu.edu.pe.DaoImpl.AsignaturaDaoImpl;


@Service
public class AsignaturaService implements Operaciones<asignatura> {
	
	@Autowired
	private AsignaturaDaoImpl DaoImpl;

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
		
		return DaoImpl.reaAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return DaoImpl.readAll2();
	}

}