package upeu.edu.pe.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import upeu.edu.pe.Services.AsignaturaService;

@RestController
@RequestMapping("/api/asignatura")
public class AsignaturaController {
	
	@Autowired
	private AsignaturaService asd;
	
	@GetMapping("/all")
	public List<Map<String, Object>> listar(){
		return asd.readAll2();
	}

}
