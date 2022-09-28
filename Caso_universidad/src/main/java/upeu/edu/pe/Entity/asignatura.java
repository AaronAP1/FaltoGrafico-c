package upeu.edu.pe.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class asignatura {
	
	private int id;
	private String nombre;
	private int creditos;
	private String tipo;
	private int curso;
	private int cuatrimestre;
	private int id_profesor;
	private int id_grado;

}
