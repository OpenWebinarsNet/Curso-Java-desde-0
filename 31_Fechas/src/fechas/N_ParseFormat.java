/**
 * 
 */
package fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * @author Openwebinars
 *
 */
public class N_ParseFormat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String diaDespuesDeHoy = "20171112";
		LocalDate formateada = LocalDate.parse(diaDespuesDeHoy, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.printf("La fecha generada de un String %s es %s %n", diaDespuesDeHoy, formateada);

		String viernes = "18/04/2014";
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate holiday = LocalDate.parse(viernes, formatter);
			System.out.printf("Cadena formateada correctamente %s, la fecha es %s%n", viernes, holiday);
		} catch (DateTimeParseException ex) {
			System.out.printf("%s no es parseable!%n", viernes);
			ex.printStackTrace();
		}

	}

}
