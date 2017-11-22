/**
 * 
 */
package misexcepciones;

/**
 * @author Openwebinars
 *
 */
public class Banco {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		CuentaCorriente cc = new CuentaCorriente("Luis Miguel", 100.0);
		
		try {
			cc.sacarDinero(160.0);
			System.out.println("Saldo actual " + cc.getSaldo());
		} catch (SaldoNegativoException e) {
			System.err.println(e.getMessage());
			System.err.println("Póngase en contacto con su banco");
		}
		

	}

}
