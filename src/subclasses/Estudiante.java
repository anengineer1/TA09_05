package subclasses;

import java.util.Random;

import superclasses.PersonaEnClase;
import utils.Sexo;

public class Estudiante extends PersonaEnClase {
	
	private double calificacion;
	
	public Estudiante(String nombre, int edad, Sexo sexo, boolean asiste, double calificacion) {
		super(nombre, edad, sexo, asiste);
		this.calificacion = calificacion;
	}
	
	//La probabilidad de que el alumno no asista es un 50% (Osea la mitad)
	//Por eso hacemos un random de 0 o 1 y si sale 1, será que no asiste
	public static boolean isDisponible() {
		Random random = new Random();
		int ValorAleatorio = random.nextInt(2);
		boolean disponible;
		
		if (ValorAleatorio == 1) {
			disponible = false;
		} else {
			disponible = true;
		}
		return disponible;
	}
	
	//Generamos numeros decimales aleatorios del 0 al 10 que seran las notas
	public static double randNota() {
		double Nota= (int) (Math.floor(Math.random() * 10));
		return Nota;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "Estudiante " + this.nombre + " ha sacado un " + this.calificacion;
	}
	
	//Comprueba si la nota es mas geande o igual a 5, entonces printa el Alumno y la nota que tiene
	public String isAprobado() {
		String EstudianteAprobado = "";
		
		if(this.calificacion >= 5) {
			EstudianteAprobado = "Estudiante " + this.nombre + " ha sacado un " + this.calificacion;
		} else {
			EstudianteAprobado = "NO";
		}
		return EstudianteAprobado;
	}

}
