package main;

import java.util.ArrayList;
import java.util.Collections;

import subclasses.Aula;
import subclasses.Estudiante;
import subclasses.Profesor;
import utils.Materia;
import utils.Sexo;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaramos los estudiantes y el profesor que van a existir
		Estudiante Estudiante1; Estudiante Estudiante2; Profesor Profesor1;
		
		//Creamos un ArrayList para todas las aulas 
		ArrayList<Aula> Aulas = new ArrayList<Aula>();
		
		
		//EJEMPLO Aula1: Donde todos los datos son random menos el nombre y el sexo
		Profesor1 = new Profesor("Jose", Profesor.randEdad(), Sexo.HOMBRE, Profesor.isDisponible(), Materia.randMateria());
		
		ArrayList<Estudiante> EstudiantesClase1 = new ArrayList<Estudiante>();
		Estudiante1 = new Estudiante("Andrea", Estudiante.randEdad(), Sexo.MUJER, Estudiante.isDisponible(), Estudiante.randNota());
		Estudiante2 = new Estudiante("Raúl", Estudiante.randEdad(), Sexo.HOMBRE, Estudiante.isDisponible(), Estudiante.randNota());
		Collections.addAll(EstudiantesClase1, Estudiante1, Estudiante2);
		
		Aula Aula1 = new Aula(Aula.randMaxEstudiantes(), Profesor1, EstudiantesClase1, Materia.randMateria());
		
		//EJEMPLO Aula2: con datos introducidos manualmente para comprobar que SI se puede hacer clase
		Profesor1 = new Profesor("Juan", Profesor.randEdad(), Sexo.HOMBRE, true, Materia.FILOSOFIA);
		
		ArrayList<Estudiante> EstudiantesClase2 = new ArrayList<Estudiante>();
		Estudiante1 = new Estudiante("Francisco", Estudiante.randEdad(), Sexo.HOMBRE, true, 10);
		Estudiante2 = new Estudiante("Maria", Estudiante.randEdad(), Sexo.MUJER, true, 8);
		Collections.addAll(EstudiantesClase2, Estudiante1, Estudiante2);
		
		Aula Aula2 = new Aula(3, Profesor1, EstudiantesClase2, Materia.FILOSOFIA);
		
		//EJEMPLO Aula3: con datos introducidos manualmente para comprobar que NO se puede hacer clase (Porque no va ningún alumno)
		Profesor1 = new Profesor("Sara", Profesor.randEdad(), Sexo.MUJER, true, Materia.FISICA);
		
		ArrayList<Estudiante> EstudiantesClase3 = new ArrayList<Estudiante>();
		Estudiante1 = new Estudiante("Javier", Estudiante.randEdad(), Sexo.HOMBRE, false, Estudiante.randNota());
		Estudiante2 = new Estudiante("Paula", Estudiante.randEdad(), Sexo.MUJER, false, Estudiante.randNota());
		Collections.addAll(EstudiantesClase3, Estudiante1, Estudiante2);

		Aula Aula3 = new Aula(Aula.randMaxEstudiantes(), Profesor1, EstudiantesClase3, Materia.FISICA);
		
		//Metemos las aulas en una ArrayList para mostrar los datos mas facilmente
		Collections.addAll(Aulas, Aula1, Aula2, Aula3);
		
		//Recoremos las aulas para mostrar los datos
		for(int i=0; i < Aulas.size(); i++) {
			Aulas.get(i).isClasePosible();
		}
	}
}
