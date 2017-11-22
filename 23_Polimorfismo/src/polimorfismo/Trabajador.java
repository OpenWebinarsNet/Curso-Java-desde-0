package polimorfismo;

public class Trabajador {
	
	private String nombre;
	private String Puesto;
	private String direccion;
	private String telefono;
	private String nSS; //Número Seguridad Social
	
	private static final double SALARIO_BASE = 30000.0;
	
	
	public Trabajador(String nombre, String puesto, String direccion, String telefono, String nSS) {
		this.nombre = nombre;
		Puesto = puesto;
		this.direccion = direccion;
		this.telefono = telefono;
		this.nSS = nSS;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPuesto() {
		return Puesto;
	}


	public void setPuesto(String puesto) {
		Puesto = puesto;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getnSS() {
		return nSS;
	}


	public void setnSS(String nSS) {
		this.nSS = nSS;
	}
	
	public double calcularPaga() {
		return SALARIO_BASE;
	}


	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", Puesto=" + Puesto + ", direccion=" + direccion + ", telefono="
				+ telefono + ", nSS=" + nSS + "]";
	}
	
	
	
	

}
