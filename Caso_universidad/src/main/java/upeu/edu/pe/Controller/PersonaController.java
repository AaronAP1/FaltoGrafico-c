package upeu.edu.pe.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import upeu.edu.pe.Services.PersonaService;

@RestController
@RequestMapping("/api/persona")

public class PersonaController {
	
	@Autowired
	private PersonaService per;
	
	@GetMapping("/all")
	public List<Map<String, Object>> listar(){
		return per.readAll2();
		
	}

}
