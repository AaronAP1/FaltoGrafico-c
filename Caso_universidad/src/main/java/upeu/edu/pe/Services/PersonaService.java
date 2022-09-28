package upeu.edu.pe.Services;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.Dao.Operaciones;
import upeu.edu.pe.Entity.persona;
import upeu.edu.pe.DaoImpl.PersonaDaoImpl;


@Service
public class PersonaService implements Operaciones<persona> {
	
	@Autowired
	private PersonaDaoImpl DaoImpl;

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
		
		return DaoImpl.reaAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return DaoImpl.readAll2();
	}

}