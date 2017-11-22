/**
 * Ejemplo de como transformar una fecha en una cadena de caracteres
 */
package fechas;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Openwebinars
 *
 */
public class O_FechaAString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalDateTime fechaLlegada = LocalDateTime.now();
		try {
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm");
			String landing = fechaLlegada.format(format);
			System.out.printf("Llegada a : %s %n", landing);
		} catch (DateTimeException ex) {
			System.out.printf("%s no puede ser formateada!%n", fechaLlegada);
			ex.printStackTrace();
		}

	}

}
