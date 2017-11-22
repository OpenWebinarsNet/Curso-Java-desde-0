package misexcepciones;

public class SaldoNegativoException extends Exception {

	public SaldoNegativoException(double saldo) {
		super("La cuenta ha quedado en descubierto (" + Double.toString(saldo) + ")");
	}

}
