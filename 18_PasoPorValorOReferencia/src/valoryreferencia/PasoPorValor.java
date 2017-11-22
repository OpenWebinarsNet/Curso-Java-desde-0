/**
 * 
 */
package valoryreferencia;

/**
 * @author Openwebinars
 *
 */
public class PasoPorValor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int x = 3;

		// invocamos el argumento y le pasamos x
		pasoPorValor(x);

		// imprimimos x y vemos si el parámetro ha cambiado
		System.out.println("Después de invocar pasoPorValor, x = " + x);

	}

	// cambiamos el valor en el método
	public static void pasoPorValor(int p) {
		p = 10;
	}

}
