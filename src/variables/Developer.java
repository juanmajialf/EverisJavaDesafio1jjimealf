package variables;

/**
 * Clase desarrollador
 * 
 * @autor Juan Manuel Jimenez Alfaro
 */

public class Developer {

	/** Variable constante con el nombre de la empresa */
	public static final String COMPANY = "EVERIS";

	/** Variable de clase con el numero total de empleados */ 
	private static int numEmployer;

	/** Variable con el nombre del empleado */
	private String name;

	/** Variable con los dias de vacaciones de los empleados */
	private int holidays = 21;

	/** Variable del numero que se asigna a cada empleado */
	private int idEmployer;

	/**
	 * Constructor de Desarrollador
	 * 
	 * @param name
	 */
	public Developer(String name) {

		// Comprueba que al crear al desarrollador no se pase del numero total admitido
		if (numEmployer < 127) {
			this.name = name;
			idEmployer = numEmployer + 1;
			numEmployer++;
		} else
			System.out.println("Alcanzado el maximo de empleados, imposible añadir mas empleados");

	}

	/**
	 * 
	 * Obtencion de los dias de vacaciones
	 * 
	 * @return holidays
	 */
	public int getHolidays() {
		return holidays;
	}

	/**
	 * Obtencion del numero del empleado
	 * 
	 * @return idEmployer
	 */
	public int getIdEmployer() {
		return idEmployer;
	}

	/**
	 * Obtencion del numero total de empleados
	 * 
	 * @return numEmployer
	 */
	public static int getNumEmployer() {
		return numEmployer;
	}

	/**
	 * Metodo que decrementa los dias de vacaciones en fuencion del numero de dias que ha gastado
	 * 
	 * @param days
	 * 
	 */
	public void decreaseHolidays(int days) {
		if (days > holidays)
			System.out.println("Dias de vacaciones insuficientes, solo te quedan " + holidays + " dias");
		else
			holidays = holidays - days;
	}

}
