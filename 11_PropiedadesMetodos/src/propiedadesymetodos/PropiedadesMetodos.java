/**
 *  PROPIEDADES Y MÉTODOS DE UNA CLASE
 */
package propiedadesymetodos;


/**
 * @author Openwebinars
 *
 */

public class PropiedadesMetodos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.setNombre("Pepe");
		p.setApellidos("Perez");
		p.setAltura(180);
		p.setEdad(25);
		p.setPeso(75.5f);
		
		System.out.println(p);

	}

}
