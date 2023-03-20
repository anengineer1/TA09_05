package subclasses;

import java.util.Random;

import superclasses.PersonaEnClase;
import utils.Materia;
import utils.Sexo;

public class Profesor extends PersonaEnClase {

	final private Materia MATERIA_DEFECTO = Materia.MATEMATICAS;
	
	private Materia materia;

	public Profesor(String nombre, int edad, Sexo sexo, boolean asiste, Materia asignatura) {
		super(nombre, edad, sexo, asiste);
		this.materia = asignatura;
	}
	
	//La probabilidad de que el profesor no asista es un 20% (Osea un quinto)
	//Por eso hacemos un random de 5 numeros y si sale el quinto, será que no asiste
	public static boolean isDisponible() {
		Random random = new Random();
		int ValorAleatorio = random.nextInt(4);
		boolean disponible;
		
		if (ValorAleatorio == 4) {
			disponible = false;
		} else {
			disponible = true;
		}
		return disponible;
	}
	
	public Profesor() {
		super();
		this.materia = this.MATERIA_DEFECTO;
	}

	public Materia getAsignatura() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}

}
