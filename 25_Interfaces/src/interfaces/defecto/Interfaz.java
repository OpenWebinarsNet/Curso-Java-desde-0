package interfaces.defecto;

public interface Interfaz {
	
	public void metodo();
	
	default public void metodoPorDefecto() {
		System.out.println("Este es uno de los nuevos métodos por defecto");
	}
	
	public static void metodoEstatico() {
		System.out.println("Método estático en un interfaz");
	}

}
