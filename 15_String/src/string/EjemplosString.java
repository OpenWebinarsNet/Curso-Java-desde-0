/**
 * USO DE LA CLASE STRING
 */
package string;

/**
 * @author Openwebinars
 *
 */
public class EjemplosString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//CONCATENAR
//		String nombre = "Mi nombre es ".concat("Pepe");
//		String nombre2 = "Mi nombre es " + "Pepe";
//		System.out.println(nombre);
//		System.out.println(nombre2);
		
		//MAYÚSCULAS-MINÚSCULAS
//		String cadena = "En un lugar de La Mancha";
//		System.out.println(cadena);
//		System.out.println(cadena.toLowerCase());
//		System.out.println(cadena.toUpperCase());
		//cadena.
		
		//STRING FORMAT
		
//		String nombre = "Pepe";
//		String apellidos = "Pérez";
//		String mensaje = "¿qué tal estás?";
//		System.out.println("Hola, soy " + nombre + " " + apellidos + ", y quiero saludarte diciéndote " + mensaje);

//		String nombre = "Pepe";
//		String apellidos = "Pérez";
//		String mensaje = "¿qué tal estás?";
//		//String str = String.format("Hola, soy %s %s y quiero saludarte diciéndote %s", nombre, apellidos, mensaje);
//		//System.out.println(str);
//		System.out.printf("Hola, soy %s %s y quiero saludarte diciéndote %s", nombre, apellidos, mensaje);
		
		//MÉTODOS DE COMPARACIÓN
		String quijote = "En un lugar de La Mancha";
		
		System.out.println(quijote.endsWith("La Mancha"));		
		System.out.println(quijote.startsWith("En un lugar"));		
		System.out.println(quijote.contains("lugar"));
		

	}

}
