/**
 * Ejemplo de como añadir una cantidad de tiempo a una fecha
 */
package fechas;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author Openwebinars
 *
 */
public class H_UnaSemanaDespues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LocalDate nextWeek = LocalDate.now().plus(1, ChronoUnit.WEEKS);
		System.out.println("Hoy es : " + LocalDate.now());
		System.out.println("Dentro de 1 semana: " + nextWeek);

	}

}
