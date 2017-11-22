/**
 * 
 */
package arrays.objetos;

import java.util.Random;

/**
 * @author Openwebinars
 *
 */
public class ManejoArrays03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Estos dos arrays nos permitirán obtener valores aleatorios para inicializar los datos
		String[] nombres = {"José", "Antonio", "Martín", "Luis", "María", "Leticia", "Luisa"};
		String[] apellidos = {"Pérez", "Gómez", "López", "García", "Muñoz", "Martínez"};
		
		//Creamos nuestro array de 5 elementos de tipo Persona
		Persona[] personas = new Persona[5];
		
		//Inicializamos los valores
		for(int i = 0; i < personas.length; i++) {
			//Obtenemos un nombre de una posición aleatoria
			String nombre = nombres[aleatorio(nombres.length)];
			//Obtenemos un apellido de una posición aleatoria			
			String apellido = apellidos[aleatorio(nombres.length)];
			//Los usamos para crear una nueva persona
			personas[i]= new Persona(nombre, apellido);
		}
		
		//Recorremos de nuevo el array, esta vez
		//para imprimir sus valores.
		for(Persona p : personas) {
			System.out.println(p);
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
