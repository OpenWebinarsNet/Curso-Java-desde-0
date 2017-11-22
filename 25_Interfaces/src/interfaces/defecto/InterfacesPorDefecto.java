package interfaces.defecto;

public class InterfacesPorDefecto {

	public static void main(String[] args) {
		
		Clase c1 = new Clase();
		
		c1.metodo();
		c1.metodoPorDefecto();
		
		Clase2 c2 = new Clase2();
		
		c2.metodo();
		c2.metodoPorDefecto();
		
		Interfaz.metodoEstatico();

	}

}
