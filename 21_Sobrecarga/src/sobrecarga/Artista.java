package sobrecarga;

public class Artista {
	
	
	public void dibuja(String s) {
		System.out.println(s);
	}
	
	public void dibuja(int i) {
		System.out.println(i);
	}
	
	public void dibuja(double f) {
		System.out.println(f);
	}
	
	public void dibuja(int i, double f) {
		System.out.println(i);
		System.out.println(f);
	}

}
