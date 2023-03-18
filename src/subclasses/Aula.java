package subclasses;

import subclasses.Estudiante;
import java.util.ArrayList;
import utils.Materia;

public class Aula {

	final private Materia MATERIA_DEFECTO = Materia.MATEMATICAS;
	final private int MAX_ESTUDIANTES_POR_DEFECTO = 20;

	private Materia materia;
	private int num_max_estudiantes;
	private ArrayList<Estudiante> lista_estudiantes;
	private Profesor profesor;

	public Aula() {
		this.materia = this.MATERIA_DEFECTO;
		this.num_max_estudiantes = this.MAX_ESTUDIANTES_POR_DEFECTO;
	}

	public Aula(int num_max_estudiantes, Profesor profesor, ArrayList<Estudiante> lista_estudiantes, Materia materia) {
		this.num_max_estudiantes = num_max_estudiantes;
		this.profesor = profesor;
		this.lista_estudiantes = lista_estudiantes;
		this.materia = materia;
	}

	public void addEstudiante(Estudiante estudiante) {
		this.lista_estudiantes.add(estudiante);
	}

	public boolean isClasePosible() {

		if ((lista_estudiantes.size() > this.num_max_estudiantes) // más estudiantes que la capacidad máxima del aula
				|| (getEstudiantesQueAsisten().size() < (this.lista_estudiantes.size() / 2)) // si hay menos de la mitad
																								// de todos los
																								// estudiantes apuntados
				|| (!this.profesor.isAsiste()) // Si el profesor no puede asistir
				|| (profesor.getAsignatura() != this.materia)) { // Si el profesor no puede dar la materia a la que el
																	// aula
																	// está destinada
			return false;
		} else {
			return true;
		}
	}

	public ArrayList<Estudiante> getEstudiantesQueAsisten() {
		ArrayList<Estudiante> estudiantes_que_asisten = new ArrayList<Estudiante>();
		for (Estudiante estudiante : lista_estudiantes) {
			if (estudiante.isAsiste()) {
				estudiantes_que_asisten.add(estudiante);
			}
		}
		return estudiantes_que_asisten;
	}

	public Materia getMateria() {
		return materia;
	}

	public int getNum_max_estudiantes() {
		return num_max_estudiantes;
	}

	public ArrayList<Estudiante> getLista_estudiantes() {
		return lista_estudiantes;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public void setNum_max_estudiantes(int num_max_estudiantes) {
		this.num_max_estudiantes = num_max_estudiantes;
	}

	public void setLista_estudiantes(ArrayList<Estudiante> lista_estudiantes) {
		this.lista_estudiantes = lista_estudiantes;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

}
