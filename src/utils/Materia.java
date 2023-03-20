package utils;

import java.util.Random;

public enum Materia {
	MATEMATICAS, FILOSOFIA, FISICA;

	private static final Random rand = new Random();
	
	//Creamos un funcion para randomizar las materias
	public static Materia randMateria()  {
		Materia[] Materias = values();
	    return Materias[rand.nextInt(Materias.length)];
	}
}