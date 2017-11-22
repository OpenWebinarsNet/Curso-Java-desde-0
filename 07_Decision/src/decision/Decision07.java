/**
 * Uso de la estructura Switch con cadenas de caracteres
 */
package decision;

/**
 * @author Openwebinars
 *
 */
public class Decision07 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int mesNumero = 0;
		String mes = "enero";

		switch (mes) {
		case "Enero":
			mesNumero = 1;
			break;
		case "febrero":
			mesNumero = 2;
			break;
		case "marzo":
			mesNumero = 3;
			break;
		case "abril":
			mesNumero = 4;
			break;
		case "mayo":
			mesNumero = 5;
			break;
		case "junio":
			mesNumero = 6;
			break;
		case "julio":
			mesNumero = 7;
			break;
		case "agosto":
			mesNumero = 8;
			break;
		case "septiembre":
			mesNumero = 9;
			break;
		case "octubre":
			mesNumero = 10;
			break;
		case "noviembre":
			mesNumero = 11;
			break;
		case "diciembre":
			mesNumero = 12;
			break;
		default:
			mesNumero = 0;
			break;
		}

		System.out.println("El mes de " + mes + " se corresponde con el número " + mesNumero );

	}

}
