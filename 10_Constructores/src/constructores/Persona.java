/**
 * Definición e implementación de una clase
 */
package constructores;

/**
 * @author Openwebinars
 *
 */
public class Persona {

	// Estructura, conocida como propiedades o atributos
	private String nombre;
	private String apellidos;
	private int edad;
	private int altura;
	private float peso;

	// Constructor vacío
	public Persona() {
		this.nombre = "desconocido";
		this.apellidos = "desconocido";
		this.edad = 0;
	}

	// Constructor con algunos parámetros
	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public Persona(String nombre, String apellidos, int edad) {
		this(nombre, apellidos);
		this.edad = edad;
	}
	
	

	public Persona(String nombre, String apellidos, int edad, int altura, float peso) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
	}

	// Comportamiento, conocido como métodos
	void caminar() {
		System.out.println("Estoy caminando");
	}

	void hablar() {
		System.out.println("Estoy hablando");
	}

	void nacer() {
		System.out.println("¡¡¡Acabo de nacer!!!");
	}

	void morir() {
		System.out.println("¡Hasta más ver!");
	}

	void presentacion() {
		System.out.println(
				"Mi nombre es " + this.nombre + " " + this.apellidos + ", y tengo " + this.edad + " años de edad.");
	}

}
