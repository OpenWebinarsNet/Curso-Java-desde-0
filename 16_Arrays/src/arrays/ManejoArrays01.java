/**
 * 
 */
package arrays;

/**
 * @author Openwebinars
 *
 */
public class ManejoArrays01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//CREACIÓN E INICIALIZACIÓN ELEMENTO A ELEMENTO
		int[] unArray = new int[10];
		
        unArray[0] = 100;
        unArray[1] = 200;
        unArray[2] = 300;
        unArray[3] = 400;
        unArray[4] = 500;
        unArray[5] = 600;
        unArray[6] = 700;
        unArray[7] = 800;
        unArray[8] = 900;
        unArray[9] = 1000;
        
        //RECORRIDO DE TODOS LOS VALORES DE UN ARRAY
        for(int i = 0; i < unArray.length; i++) {
        	System.out.println(unArray[i]);
        }
		
        
	}

}
