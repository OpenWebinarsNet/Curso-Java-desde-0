/**
 * Ejemplo de como verificar si el año de una fecha es bisiesto
 */
package fechas;

import java.time.LocalDate;

/**
 * @author Openwebinars
 *
 */
public class L_Bisiesto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		if (today.isLeapYear()) {
			System.out.println("Este año es bisiesto");
		} else {
			System.out.println("Este año no es bisiesto");
		}

	}

}
