package subclasses;

import superclasses.PersonaEnClase;
import utils.Materia;
import utils.Sexo;

public class Profesor extends PersonaEnClase {

	final private Materia MATERIA_DEFECTO = Materia.MATEMATICAS;
	
	private Materia materia;

	public Profesor(String nombre, int edad, Sexo sexo, Materia asignatura) {
		// el enunciado dice que el 20% de las veces no podrá asistir por tanto 80% de
		// asistencia
		super(nombre, edad, sexo, 80.0);
		this.materia = asignatura;
	}
	
	public Profesor() {
		// el enunciado dice que el 20% de las veces no podrá asistir por tanto 80% de
		// asistencia
		super();
		this.materia = this.MATERIA_DEFECTO;
	}

	public Materia getAsignatura() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

}
