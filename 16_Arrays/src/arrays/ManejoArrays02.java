/**
 * 
 */
package arrays;

/**
 * @author Openwebinars
 *
 */
public class ManejoArrays02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//CREACIÓN E INICIALIZACIÓN CON EL ATAJO { }
		//En este caso, el tamaño lo determina la cantidad 
		//de valores que inicializamos
		int[] unArray = { 
			    100, 200, 300,
			    400, 500, 600, 
			    700, 800, 900, 1000
			};
        
        //RECORRIDO DE TODOS LOS VALORES DE UN ARRAY
		//CON EL BUCLE FOR MEJORADO
        for(int i : unArray) {
        	System.out.println(i);
        }
		
        
	}

}
