package superclasses;

import utils.Sexo;

public class PersonaEnClase {
	final private String NOMBRE_POR_DEFECTO = "";
	final private int EDAD_POR_DEFECTO = 25;
	final protected Sexo SEXO_POR_DEFECTO = Sexo.MUJER;
	final protected double PROBAVILIDAD_DE_ASISTENCIA_POR_DEFECTO = 50;
	
	protected String nombre;
	protected int edad;
	protected Sexo sexo;
	protected double probabilidad_asistencia_porcentaje;
	protected boolean asiste; // True si asiste

	public PersonaEnClase() {
		this.nombre = this.NOMBRE_POR_DEFECTO;
		this.edad = this.EDAD_POR_DEFECTO;
		this.sexo = this.SEXO_POR_DEFECTO;
		this.probabilidad_asistencia_porcentaje = this.PROBAVILIDAD_DE_ASISTENCIA_POR_DEFECTO;
	}

	public PersonaEnClase(String nombre, int edad, Sexo sexo, double probabilidad_asistencia_porcentaje) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.probabilidad_asistencia_porcentaje = probabilidad_asistencia_porcentaje;
	}

	protected void calculaAsistencia() {
		double valor_aleatorio = Math.random() * 100;
		this.asiste = (probabilidad_asistencia_porcentaje > valor_aleatorio);
	}

	public boolean isDisponible() {
		return asiste;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public double getProbabilidad_asistencia_porcentaje() {
		return probabilidad_asistencia_porcentaje;
	}

	public boolean isAsiste() {
		// true si asiste
		return asiste;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setProbabilidad_asistencia_porcentaje(double probabilidad_asistencia_porcentaje) {
		this.probabilidad_asistencia_porcentaje = probabilidad_asistencia_porcentaje;
	}

	public void setAsiste(boolean asiste) {
		this.asiste = asiste;
	}
}
