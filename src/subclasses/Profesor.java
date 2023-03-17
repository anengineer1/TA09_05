package subclasses;

import superclasses.PersonaEnClase;

public class Profesor extends PersonaEnClase {

	final private String MATERIA_DEFECTO = "Matematicas";
	
	private String asignatura;

	public Profesor(String nombre, String edad, String sexo, String asignatura) {
		// el enunciado dice que el 20% de las veces no podrá asistir por tanto 80% de
		// asistencia
		super(nombre, edad, sexo, 80.0);
		this.asignatura = asignatura;
	}
	
	public Profesor() {
		// el enunciado dice que el 20% de las veces no podrá asistir por tanto 80% de
		// asistencia
		super();
		this.asignatura = this.MATERIA_DEFECTO;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

}
