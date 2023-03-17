

public class Aula {
	
	final private String MATERIA_DEFECTO = "Matematicas";
	final private int MAX_ESTUDIANTES_POR_DEFECTO = 20;
	
	private String materia;
	private int num_max_estudiantes;
	private ArrayList<Alumno> lista_alumnos;

	public Aula() {
		this.materia = this.MATERIA_DEFECTO;
		this.num_max_estudiantes = this.MAX_ESTUDIANTES_POR_DEFECTO;
	}
	
	
}
