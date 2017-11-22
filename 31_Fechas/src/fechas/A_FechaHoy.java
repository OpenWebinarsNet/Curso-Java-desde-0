/**
 * Ejemplo de como obtener la fecha actual
 */
package fechas;

import java.time.LocalDate;

/**
 * @author Openwebinars
 *
 */
public class A_FechaHoy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LocalDate hoy = LocalDate.now();
		System.out.println("La fecha actual es : " + hoy);

	}

}
