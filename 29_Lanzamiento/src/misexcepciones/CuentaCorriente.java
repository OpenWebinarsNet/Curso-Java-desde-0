package misexcepciones;

public class CuentaCorriente {
	
	private String propietario;
	private double saldo;
	
	
	public CuentaCorriente(String propietario, double saldo) {
		this.propietario = propietario;
		this.saldo = saldo;
	}


	public String getPropietario() {
		return propietario;
	}


	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}


	public double getSaldo() {
		return saldo;
	}
	
	public void ingresarDinero(double cantidad) {
		saldo += cantidad;
	}
	
	public void sacarDinero(double cantidad) throws SaldoNegativoException {
		saldo -= cantidad;
		if (saldo < 0) {
			throw new SaldoNegativoException(saldo);
		}
	}
	
	
	
	

}
