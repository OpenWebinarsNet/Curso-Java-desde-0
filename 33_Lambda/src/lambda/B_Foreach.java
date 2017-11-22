/**
 * EJEMPLO DE USO DEL MÉTODO FOREACH JUNTO CON EXPRESIONES LAMBDA
 */
package lambda;

import java.util.Arrays;
import java.util.List;

/**
 * @author Openwebinars
 *
 */
public class B_Foreach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		//1ª Forma clásica de imprimir los elementos de una lista
//		for(Integer i: lista)
//			System.out.println(i);
		
		//2ª Uso de forEach
//		lista.forEach(e -> System.out.println(e));
		
		//3ª Uso de referencias a métodos con ::
//		lista.forEach(System.out::println);
		
		//4º Uso de un bloque de sentencias que suma un valor fijo a los 
		//elementos de la lista
//		lista.forEach((e) -> {
//			e = e+1;
//			System.out.println(e);
//		});
		
		

	}

}
