package subclasses;

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
	
	//Función que mira si es posible dar clase
	public void isClasePosible() {
		if ((lista_estudiantes.size() > this.num_max_estudiantes) //Si hay más estudiantes que la capacidad máxima del aula
				|| (getEstudiantesQueAsisten().size() < (this.lista_estudiantes.size() / 2)) //Si hay menos de la mitad de todos los estudiantes apuntados
				|| (Profesor.isDisponible() == false) //Si el profesor no puede asistir
				|| (profesor.getAsignatura() != this.materia)) { //Si el profesor no puede dar la materia a la que el aula está destinada
			System.out.println();
			System.out.println("NO se puede dar clase en este aula");
			System.out.println();
			System.out.println("----------------------------------");
		} else {
			System.out.println();
			System.out.println("SI se puede dar clase en este aula");
			System.out.println();
			for(int x=0; x < this.lista_estudiantes.size(); x++) {
				if(this.lista_estudiantes.get(x).isAprobado() != "NO") {
					System.out.println(this.lista_estudiantes.get(x).isAprobado());
				}
			}
			System.out.println();
			System.out.println("----------------------------------");
		}
	}
	
	//Se añaden los alumnos que asisten a un ArrayList para poder contarlos y comprobar si son mas de la mitad
	public ArrayList<Estudiante> getEstudiantesQueAsisten() {
		ArrayList<Estudiante> estudiantes_que_asisten = new ArrayList<Estudiante>();
		for (Estudiante estudiante : lista_estudiantes) {
			if (estudiante.isAsiste() == true) {
				estudiantes_que_asisten.add(estudiante);
			}
		}
		return estudiantes_que_asisten;
	}
	
	//Generamos un nuemro random para que sea el número máximo de estudiantes
	public static int randMaxEstudiantes() {
		//Para que los ejemplos funcionen se puede hacer clase con 2 alumnos, pero no seria realista
		int MaxEstudiantes= (int) (Math.floor(Math.random() * (35 - 2 + 1)) + 2);
		return MaxEstudiantes;
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
