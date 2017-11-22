/**
 * Ejemplo más complejo de uso de SWITCH
 */
package decision;

/**
 * @author Openwebinars
 *
 */
public class Decision06 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int mes = 4;
		int numDias = 0;

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numDias = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDias = 30;
			break;
		case 2:
			// No tenemos en cuenta si el año es bisiesto
			// para no hacer más complejo el ejemplo
			numDias = 28;
			break;
		default:
			System.out.println("Mes no válido");
			break;
		}
		System.out.println("Número de días = " + numDias);
	}

}
