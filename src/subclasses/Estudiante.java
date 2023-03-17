package subclasses;

import superclasses.PersonaEnClase;

public class Estudiante extends PersonaEnClase {
	
	private double calificacion;
	
	public Estudiante(String nombre, String edad, String sexo, double probabilidad_asistencia_porcentaje, double calificacion) {
		super(nombre, edad, sexo, probabilidad_asistencia_porcentaje);
		this.calificacion = calificacion;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

}
