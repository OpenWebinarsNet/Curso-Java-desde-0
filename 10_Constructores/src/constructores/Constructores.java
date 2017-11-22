/**
 * 
 */
package constructores;

/**
 * @author Openwebinars
 *
 */
public class Constructores {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Persona johndoe = new Persona();		
		johndoe.presentacion();
		
		Persona manuel = new Persona("Manuel", "Ruiz González");		
		manuel.presentacion();
		
		Persona antonio = new Persona("Antonio", "Castillo Real", 31);
		antonio.presentacion();

	}

}
