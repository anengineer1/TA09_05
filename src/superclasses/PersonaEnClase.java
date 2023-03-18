package superclasses;

public class PersonaEnClase {
	protected String nombre;
	protected String edad;
	protected String sexo;
	protected double probabilidad_asistencia_porcentaje;
	protected boolean asiste; // True si asiste

	public PersonaEnClase(String nombre, String edad, String sexo, double probabilidad_asistencia_porcentaje) {
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

	public String getEdad() {
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

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public void setProbabilidad_asistencia_porcentaje(double probabilidad_asistencia_porcentaje) {
		this.probabilidad_asistencia_porcentaje = probabilidad_asistencia_porcentaje;
	}

	public void setAsiste(boolean asiste) {
		this.asiste = asiste;
	}
}
