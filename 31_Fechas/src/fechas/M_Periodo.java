/**
 * Ejemplo de como manejar la cantidad de tiempo que hay entre dos fechas
 */
package fechas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * @author Openwebinars
 *
 */
public class M_Periodo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDate java8Release = LocalDate.of(2014, Month.MARCH, 14);
		LocalDate java9Release = LocalDate.of(2017, Month.SEPTEMBER, 27);
		Period periodToNextJavaRelease = Period.between(java8Release, java9Release);
		System.out.println("Meses transcurridos entre la liberación de Java 8 y Java 9 : " + periodToNextJavaRelease.toTotalMonths());

	}

}
