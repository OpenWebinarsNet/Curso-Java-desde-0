package usodesuper;

public class ClaseBase {
	
	private String mensaje;
	
	public ClaseBase() {
		this.mensaje = "Saludo desde la clase base";
	}
	
	public ClaseBase(String s) {
		this.mensaje = s;
	}
	
	public void imprimir() {
		//System.out.println("Saludo desde la clase base");
		System.out.println(mensaje);
	}

}
