package superclasses;

import utils.Sexo;

public abstract class PersonaEnClase {
	final private String NOMBRE_POR_DEFECTO = "";
	final private int EDAD_POR_DEFECTO = 25;
	final protected Sexo SEXO_POR_DEFECTO = Sexo.MUJER;
	
	protected String nombre;
	protected int edad;
	protected Sexo sexo;
	protected boolean asiste; // True si asiste

	public PersonaEnClase() {
		this.nombre = this.NOMBRE_POR_DEFECTO;
		this.edad = this.EDAD_POR_DEFECTO;
		this.sexo = this.SEXO_POR_DEFECTO;
	}

	public PersonaEnClase(String nombre, int edad, Sexo sexo, boolean asiste) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.asiste = asiste;
	}
	
	//Creamos un funcion para randomizar la edad
	public static int randEdad() {
		//Suponemos que el aula es de universiad asi que la persona no puede tener menos de 18 años, pero si puede ser un profesor muy joven
		//El maximo de edad sera 65 porque si no el alumno seria demasiado viejo y el profesor ya se jubilaría
		int Edad= (int) (Math.floor(Math.random() * (65 - 18 + 1)) + 18);
		return Edad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
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

	public void setAsiste(boolean asiste) {
		this.asiste = asiste;
	}
}
