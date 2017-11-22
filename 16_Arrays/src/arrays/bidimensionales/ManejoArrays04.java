/**
 * 
 */
package arrays.bidimensionales;

import java.util.Random;

/**
 * @author Openwebinars
 *
 */
public class ManejoArrays04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//No tiene porqué ser cuadrado
		int[][] bidimensional = new int[10][20];
		final int TOPE = 100;
		
		for(int i = 0; i < bidimensional.length; i++) {
			for(int j = 0; j < bidimensional[0].length; j++) {
				bidimensional[i][j] = aleatorio(TOPE);
			}
		}
				

		for(int i = 0; i < bidimensional.length; i++) {
			for(int j = 0; j < bidimensional[0].length; j++) {
				System.out.print(bidimensional[i][j]+ "\t");
			}
			System.out.println("");
		}

	}
	
	/*
	 * ESTE MÉTODO DEVUELVE UN NÚMERO ALEATORIO ENTRE
	 * 0 y TOPE-1.
	 */
	public static int aleatorio(int tope) {
		Random r = new Random();		
		return r.nextInt(tope-1);
	}

}
