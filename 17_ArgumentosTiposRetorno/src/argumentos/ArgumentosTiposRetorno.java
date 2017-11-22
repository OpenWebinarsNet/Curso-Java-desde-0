/**
 * 
 */
package argumentos;

/**
 * @author Openwebinars
 *
 */
public class ArgumentosTiposRetorno {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		imprimeMensajes("En un lugar", "de La Mancha");
		imprimeMensajes("de cuyo nombre", "no quiero acordarme", "no ha mucho tiempo");
		imprimeMensajes("...");
		imprimeMensajes();
	}
	
	public static void imprimeMensajes(String... mensajes) {
		
		for(String mensaje : mensajes) {
			System.out.print(mensaje + " ");
		}
		System.out.println("");
		
	}

}
