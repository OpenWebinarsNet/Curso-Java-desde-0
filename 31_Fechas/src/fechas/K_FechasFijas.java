/**
 * Ejemplo de como usar fechas fijas (mes y año), como la fecha de caducidad de una tarjeta de crédito,
 * haciendo uso de la clase YearMonth.
 */
package fechas;

import java.time.Month;
import java.time.YearMonth;

/**
 * @author Openwebinars
 *
 */
public class K_FechasFijas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		YearMonth anioYMesActual = YearMonth.now();
		System.out.printf("Días en la clase MonthYear %s: %d%n", anioYMesActual, anioYMesActual.lengthOfMonth());
		YearMonth caducidadTarjetaCredito = YearMonth.of(2018, Month.FEBRUARY);
		System.out.printf("Su tarjeta de crédito caduca en %s ", caducidadTarjetaCredito);

	}

}
