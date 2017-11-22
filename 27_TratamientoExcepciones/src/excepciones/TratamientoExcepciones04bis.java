/**
 * 
 */
package excepciones;

/**
 * @author Openwebinars
 *
 */
public class TratamientoExcepciones04bis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] mensajes = { "En un lugar", "de La Mancha", "de cuyo nombre", "no quiero acordarme" };
		//String[] mensajes = { "En un lugar", null, "de cuyo nombre", "no quiero acordarme", "no ha mucho tiempo vivía" };

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(mensajes[i].toUpperCase());
			}
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.err.println("Tratamiento particular a las excepción ArrayIndex...");
		} catch (NullPointerException ex) {
			System.err.println("Tratamiento particular a la excepción NullPointer...");
		}
		
		System.out.println("Mensaje final");

	}

}
