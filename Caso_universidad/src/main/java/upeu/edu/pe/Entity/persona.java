package upeu.edu.pe.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class persona {
	
	private int id;
	private int nif;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String ciudad;
	private String direccion;

}
