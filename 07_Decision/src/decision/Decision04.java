/**
 * Ejemplo de uso de varias estructuras IF-ELSE-IF
 * anidadas
 */
package decision;

/**
 * @author Openwebinars
 *
 */
public class Decision04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		float puntuacion = 7.6f;
		
		if (puntuacion >= 9) {
			System.out.println("Tienes un SOBRESALIENTE");
		} else if (puntuacion >= 7) {
			System.out.println("Tienes un NOTABLE");
		} else if (puntuacion >= 5) {
			System.out.println("Tienes un APROBADO");
		} else {
			System.out.println("Estás SUSPENSO. Lo siento");
		}
		
		
	}

}
