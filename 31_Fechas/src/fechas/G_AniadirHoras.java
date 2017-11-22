/**
 * Ejemplo de como añadir horas a una hora en particular
 */
package fechas;

import java.time.LocalTime;

/**
 * @author Openwebinars
 *
 */
public class G_AniadirHoras {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		LocalTime newTime = time.plusHours(2); // añadiendo dos horas 
		System.out.println("Hora, después de 2 horas : " + newTime);

	}

}
