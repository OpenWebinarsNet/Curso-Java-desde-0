/**
 * Ejemplo de como testear si dos fechas son iguales
 */
package fechas;

import java.time.LocalDate;

/**
 * @author Openwebinars
 *
 */
public class D_FechasIguales {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDate fecha = LocalDate.of(2017, 11, 11);
		LocalDate hoy = LocalDate.now();
		if (fecha.equals(hoy)) {
			System.out.printf("Hoy %s y la fecha %s son la misma fecha", hoy, fecha);
		} else {
			System.out.println("Las fechas no son iguales");
		}

	}

}
