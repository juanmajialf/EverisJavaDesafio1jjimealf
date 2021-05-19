package fpdualeveris;

import variables.Developer;

/**
 * Clase principal
 * 
 * @autor Juan Manuel Jimenez Alfaro
 */
public class FPDual {

	/**
	 * Metodo principal
	 * 
	 * @param arg
	 */
	public static void main(String[] args) {

		// Ejecucion del desafio
		variablesChallenge();

	}

	/**
	 * Metodo de ejecucion
	 * 
	 */
	@SuppressWarnings("static-access")
	private static void variablesChallenge() {

		// Creacion de desarrolladores
		Developer dev1 = new Developer("Juan");
		Developer dev2 = new Developer("Ana");
		Developer dev3 = new Developer("Alejandro");
		Developer dev4 = new Developer("Maria");

		// Muestra el numero total de desarrolladores
		System.out.println("Numero total de empleados = " + dev1.getNumEmployer());
		System.out.println("Numero total de empleados = " + dev4.getNumEmployer());

		// Muestra el numero de cada desarrollador
		System.out.println("El identificador del desarrollador 1 es " + dev1.getIdEmployer());
		System.out.println("El identificador del desarrollador 2 es " + dev2.getIdEmployer());
		System.out.println("El identificador del desarrollador 3 es " + dev3.getIdEmployer());
		System.out.println("El identificador del desarrollador 4 es " + dev4.getIdEmployer());

		// Descuenta en 2 los dias de vacaciones del desarrollador 2
		dev2.decreaseHolidays(2);

		// Muestra el numero de dias de vacaciones de cada desarrollador
		System.out.println("Dias de vacaciones del desarrollador 1 son " + dev1.getHolidays());
		System.out.println("Dias de vacaciones del desarrollador 2 son " + dev2.getHolidays());
		System.out.println("Dias de vacaciones del desarrollador 3 son " + dev3.getHolidays());
		System.out.println("Dias de vacaciones del desarrollador 4 son " + dev4.getHolidays());

	}

}
