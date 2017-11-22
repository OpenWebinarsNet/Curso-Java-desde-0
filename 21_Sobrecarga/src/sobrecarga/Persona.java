package sobrecarga;

public class Persona {

	private String nombre;
	private String apellidos;
	private int edad;
	private int altura;
	private float peso;
	
	
	public Persona() {
	}
	
	public Persona(String nombre, String apellidos) {
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	

	public Persona(String nombre, String apellidos, int edad) {
//		this.nombre = nombre;
//		this.apellidos = apellidos;
		this(nombre, apellidos);
		this.edad = edad;
	}
	
	public Persona(String nombre, String apellidos, int edad, int altura, float peso) {
//		this.nombre = nombre;
//		this.apellidos = apellidos;
//		this.edad = edad;
		this(nombre, apellidos, edad);
		this.altura = altura;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}
	
	
	
	

}
