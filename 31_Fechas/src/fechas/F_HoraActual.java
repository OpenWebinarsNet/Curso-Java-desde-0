/**
 * Ejemplo de como obtener la hora actual, incluidos hasta los nanosegundos
 */
package fechas;

import java.time.LocalTime;

/**
 * @author Openwebinars
 *
 */
public class F_HoraActual {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println("La hora actual es : " + time);

	}

}
