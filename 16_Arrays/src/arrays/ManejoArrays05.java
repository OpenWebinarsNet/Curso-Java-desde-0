/**
 * 
 */
package arrays;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Openwebinars
 *
 */
public class ManejoArrays05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = new int[100];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = aleatorio(100);
		}
		
		printArray(array);
				
		
		//Podemos crear otro array, copia del primero, ampliando su longitud
		int[] otroArray = Arrays.copyOf(array, 200);
		
		//Podemos ordenar los elementos de un array
		Arrays.sort(otroArray);
		System.out.println("");
		System.out.println("Array ordenado");
		printArray(otroArray);
		
		//Posición de un número aleatorio, si es que está
		int num = aleatorio(100);
		int pos = Arrays.binarySearch(array, num);
		System.out.println("");
		if (pos >= 0)
			System.out.printf("El elemento " + num + " está contenido en el array, en la posición "+ pos);
		else
			System.out.println("El elemento " + num + " no está en el array");

		
		//JAVA SE 8
		//El método parallelsort realiza una ordenación más rápida para arrays
		//muy largos
		int[] arrayGrande = new int[123456];
		//Este método sirve para inicializar un array con valores
		//y usa una expresión lambda, que aprenderemos a crear
		//en la última lección del curso
		Arrays.parallelSetAll(arrayGrande, i -> aleatorio(12345));		
		Arrays.parallelSort(arrayGrande);
	}
	
	/*
	 * ESTE MÉTODO DEVUELVE UN NÚMERO ALEATORIO ENTRE
	 * 0 y TOPE-1.
	 */
	public static int aleatorio(int tope) {
		Random r = new Random();		
		return r.nextInt(tope-1);
	}
	
	/*
	 * Este método imprime un array, indicando para
	 * cada elemento su valor y su posición
	 */
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "[" + i +"]  ");
			if (i > 0 && i % 10 == 0) 
				System.out.println("");
		}
		System.out.println("");
	}


}
